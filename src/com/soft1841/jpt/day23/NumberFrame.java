package com.soft1841.jpt.day23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 线程的暂停与继续
 */
public class NumberFrame extends JFrame implements ActionListener {
    private JLabel numberLabel;
    private JButton pauseBtn, resumeBtn;
    private NumberThread numberThread;

    public NumberFrame() {
        init();
        setTitle("线程的暂停与恢复");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void init() {
        pauseBtn = new JButton("Pause");
        resumeBtn = new JButton("Continue");
        pauseBtn.addActionListener(this);
        resumeBtn.addActionListener(this);
        numberLabel = new JLabel();
        Font font = new Font("Chiller", Font.BOLD, 50);
        numberLabel.setFont(font);
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 100));
        add(numberLabel);
        add(pauseBtn);
        add(resumeBtn);
        numberThread = new NumberThread();
        numberThread.setNumLbel(numberLabel);
        Thread thread = new Thread(numberThread);
        thread.start();
    }

    public static void main(String[] args) {
        new NumberFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pauseBtn) {
            numberThread.pauseThread();
        }
        if (e.getSource() == resumeBtn) {
            numberThread.resumeThread();
        }
    }
}

class NumberThread implements Runnable {
    private JLabel numLbel;


    public void setNumLbel(JLabel numLbel) {
        this.numLbel = numLbel;
    }

    private final Object lock = new Object();
    private boolean pause = false;

    void pauseThread() {
        pause = true;
    }

    void resumeThread() {
        pause = false;
        synchronized (lock) {
            lock.notify();
        }
    }

    void onPause() {
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        int index = 0;
        while (true) {
            while (pause) {
                onPause();
            }
            try {
                numLbel.setText(String.valueOf(index));
                Thread.sleep(500);
                ++index;
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}