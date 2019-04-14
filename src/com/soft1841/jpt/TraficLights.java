package com.soft1841.jpt;

import javax.swing.*;
import java.awt.*;

public class TraficLights extends JFrame {
    private JPanel contentPane;
    private JLabel lblImage;

    public TraficLights() {
        init();
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(150, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void init() {
        // 内容面板
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        setContentPane(contentPane);
        // 图片面板
        JPanel imagePane = new JPanel();
        imagePane.setBackground(Color.WHITE);
        contentPane.add(imagePane);
        imagePane.setLayout(new BorderLayout(0, 0));
        // 标签
        lblImage = new JLabel("");
        lblImage.setBackground(Color.WHITE);
        lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Green.png")));
        imagePane.add(lblImage, BorderLayout.CENTER);

        Thread thread = new TurnColor(lblImage);
        thread.start();
    }

    public static void main(String[] args) {
        new TraficLights();
    }
}


class TurnColor extends Thread {
    private JLabel lblImage;

    public TurnColor(JLabel lblImage) {
        this.lblImage = lblImage;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Yellow.png")));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Red.png")));
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lblImage.setIcon(new ImageIcon(TraficLights.class.getResource("/img/Green.png")));
        }
    }
}