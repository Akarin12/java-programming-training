package com.soft1841.jpt.swing;

import javax.swing.*;
import java.awt.*;

/**
 * 实例03  Swing的流式布局
 * @author Yue Tang
 * 2019.3.25
 */
public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition() {
        setTitle("本场口使用流式布局");
        Container container = getContentPane();
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        for (int i = 0; i < 10; i++) {
            container.add(new JButton("button" + i));
        }
        setSize(300, 200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
