package com.soft1841.jpt.aw;

import javax.swing.*;

public class PrBar implements Runnable {
    int count = 0;
    private JProgressBar progressBar = new JProgressBar();
    private JFrame jFrame;

    public void setBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public void setFrame(JFrame jFrame) {
        this.jFrame = jFrame;
    }

    @Override
    public void run() {
        while (true) {
            progressBar.setValue(++count);
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (count == 100)
                break;
        }
        jFrame.dispose();
    }
}