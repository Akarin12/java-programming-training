package com.soft1841.jpt.swing;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * 卡片布局
 *
 * @author Yue Tang
 * 2019.4.2
 */
public class CardLayoutTest extends JFrame implements ActionListener {
    private JPanel cardPanel;
    private JButton preButton, nextButton;
    private JPanel buttonPanel;
    private CardLayout cardLayout;

    public CardLayoutTest() {
        init();
        setTitle("CardLayout卡片布局");
        setSize(new Dimension(900, 600));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        //创建卡片布局对象
        cardLayout = new CardLayout();
        //创建一个容器，设置成卡片布局
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);
        //循环三次每次向容器中加入一个getpanel()方法得到面板对象，编号1,2,3
        for (int i = 0; i < 5; i++) {
            cardPanel.add(String.valueOf(i + 1), getPanel());
        }
        //容器加入窗体中间
        add(cardPanel);
        //底部按钮面板，放入两个按钮，面板加入窗体底部
        buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(120, 165, 241));
        preButton = new JButton("上一张");
        nextButton = new JButton("下一张");
        buttonPanel.add(preButton);
        buttonPanel.add(nextButton);
        add(buttonPanel, BorderLayout.SOUTH);
        //按钮监听
        preButton.addActionListener(this);
        nextButton.addActionListener(this);
    }

    private JPanel getPanel() {
        JPanel newPanel = new JPanel();
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        newPanel.setBackground(new Color(r, g, b));
        return newPanel;

    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new CardLayoutTest();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //点击的是“上一张”按钮
        if (e.getSource() == preButton) {
            //调用previous显示上一张
            cardLayout.previous(cardPanel);
        } else {
            //调用next显示下一张
            cardLayout.next(cardPanel);
        }
    }
}
