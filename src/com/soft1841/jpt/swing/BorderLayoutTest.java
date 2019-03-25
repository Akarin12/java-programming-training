package com.soft1841.jpt.swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {
    public BorderLayoutTest() {
        setTitle("边界布局管理器");
        Container c = getContentPane();
        setLayout(new BorderLayout());
        c.add(new JButton("中神通"), BorderLayout.CENTER);
        c.add(new JButton("北乞"), BorderLayout.NORTH);
        c.add(new JButton("南帝"), BorderLayout.SOUTH);
        c.add(new JButton("西毒"), BorderLayout.WEST);
        c.add(new JButton("东邪"), BorderLayout.EAST);
        setSize(320, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
