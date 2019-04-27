package com.soft1841.jpt.aw;

import javax.swing.*;
import java.awt.*;

public class ProgressBarFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private Thread threadA;
    private JProgressBar progressBar = new JProgressBar();

    public ProgressBarFrame() {
        Init();
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(150, 20);
        setVisible(true);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
    }

    public void Init() {
        getContentPane().add(progressBar, BorderLayout.NORTH);
        progressBar.setStringPainted(true);
        PrBar prBar = new PrBar();
        prBar.setBar(progressBar);
        prBar.setFrame(this);
        threadA = new Thread(prBar);
        threadA.start();
    }
}