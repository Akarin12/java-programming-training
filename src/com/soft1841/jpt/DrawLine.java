package com.soft1841.jpt;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawLine extends JFrame {
    public DrawLine() {
        init();
        setTitle("绘制彩色线段");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void init() {
        getContentPane().setBackground(new Color(220, 220, 220));
        DrawLineThread drawLineThread = new DrawLineThread();
        drawLineThread.setFrame(this);
        new Thread(drawLineThread).start();
    }
    public static void main(String[] args) {
        new DrawLine();
    }
}


class DrawLineThread implements Runnable {
    int x = 114;
    int y = 514;
    private JFrame frame;
    private Color[] colors = {Color.WHITE, Color.BLUE, Color.GRAY, Color.GREEN, Color.ORANGE, Color.YELLOW,
            Color.RED, Color.PINK, Color.LIGHT_GRAY};


    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(600);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Graphics graphics = frame.getGraphics();
            graphics.setColor(colors[random.nextInt(colors.length)]);
            graphics.drawLine(x, y, 650, y);
            y += 10;
            if (y >= 500) {
                y = 100;
            }
        }
    }
}