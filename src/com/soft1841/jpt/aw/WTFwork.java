package com.soft1841.jpt.aw;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import java.io.InputStream;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.URL;

public class WTFwork extends JFrame implements ActionListener {
    private JButton osBtn, newBtn;
    private JFileChooser fileChooser;
    private JPanel bottomPanel;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JTextField textField;

    public WTFwork() {
        Init();
        setTitle("新建");
        setSize(new Dimension(1000, 700));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void Init() {
        textField = new JTextField();
        GhostText ghostText = new GhostText(textField, "输入网址,仅支持简书");
        textField.setPreferredSize(new Dimension(300, 30));
        newBtn = new JButton("连接");
        osBtn = new JButton("另存为");
        bottomPanel = new JPanel();
        bottomPanel.add(osBtn);
        bottomPanel.add(newBtn);
        bottomPanel.add(textField);
        osBtn.addActionListener(this);
        newBtn.addActionListener(this);
        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(bottomPanel, BorderLayout.NORTH);
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new WTFwork();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == osBtn) {
            if (textArea.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "你真的要保存空文件吗");
            } else {
                fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File("F:/"));
                fileChooser.setFileFilter(new FileNameExtensionFilter("txt(*.txt)", "txt"));
                fileChooser.setSelectedFile(new File("新建文本文档.txt"));
                int result = fileChooser.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    String str = textArea.getText();
                    File file = fileChooser.getSelectedFile();
                    try {
                        file.createNewFile();
                        OutputStream out = new FileOutputStream(file);
                        PrintStream printStream = new PrintStream(out);
                        printStream.print(str);
                        out.close();
                        printStream.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    setTitle(file.getAbsolutePath());
                }
            }
        }

        if (e.getSource() == newBtn) {
            URL url;
            try {
                url = new URL(textField.getText());
                InputStream in = url.openStream();

                new ProgressBarFrame();
                LinkStart linkStart = new LinkStart();
                linkStart.setArea(textArea);
                linkStart.setField(textField);
                Thread thread = new Thread(linkStart);
                thread.start();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "请输入有效的URL");
                url = null;
            }
        }

    }
}