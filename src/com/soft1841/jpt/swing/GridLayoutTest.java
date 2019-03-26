package com.soft1841.jpt.swing;

import java.awt.*;
import java.time.LocalDateTime;
import javax.swing.*;

public class GridLayoutTest extends JFrame {
    //定义一个面板数组
    private JLabel dateLabel;
    private JRadioButton radioButton;
    private JPanel[] panels;
    private JPasswordField jp;

    public GridLayoutTest() {
        init();
        setTitle("GridLayout网格布局管理器");
        //界面最大化
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        getContentPane().setBackground(new Color(255, 255, 255));
        //定义三行三列九宫格，放置九个面板
        GridLayout gridLayout = new GridLayout(3, 3, 50, 30);
        setLayout(gridLayout);
        //创建面板数组
        panels = new JPanel[9];
        //循环创建每个面板对象
        for (int i = 0; i < 9; i++) {
            panels[i] = new JPanel();
            //面板上加边框
            panels[i].setBorder(BorderFactory.createTitledBorder("面板" + (i + 1)));
            //面板以此加入网格布局管理器，变成九宫格
            add(panels[i]);
        }
        //设置第一个面板背景色，其布局方式默认为FlowLayout居中对齐
        panels[0].setBackground(new Color(101, 47, 223));
        //在第一个面板内部加入五个按钮
        for (int i = 0; i < 5; i++) {
            panels[0].add(new JButton("z"));
        }
        //设置第二个面板为GirdLayout网格布局，设置背景颜色
        panels[1].setLayout(new BorderLayout(20, 20));
        panels[1].setBackground(new Color(193, 173, 0));
        //五个方向加入按钮
        panels[1].add(new JButton("北"), BorderLayout.NORTH);
        panels[1].add(new JButton("南"), BorderLayout.SOUTH);
        panels[1].add(new JButton("东"), BorderLayout.EAST);
        panels[1].add(new JButton("西"), BorderLayout.WEST);
        panels[1].add(new JButton("中"), BorderLayout.CENTER);

        panels[2].setBackground(new Color(59, 158, 75));
        JTextArea ta = new JTextArea(10, 50);
        JScrollPane sp = new JScrollPane(ta);
        panels[2].add(sp);

        //设置第三个面板为GirdLayout网格布局，设置背景颜色
        panels[3].setLayout(new GridLayout(3, 3, 10, 10));
        panels[3].setBackground(new Color(77, 182, 172));
        //一次加入9个按钮
        for (int i = 0; i < 9; i++) {
            panels[3].add(new JButton(String.valueOf(i + 1)));
        }

        //设置第五个面板，设置背景颜色
        panels[4].setBackground(new Color(254, 107, 136));
        JLabel j1 = new JLabel("zaima", JLabel.CENTER);
        j1.setBackground(new Color(254, 99, 176));
        j1.setHorizontalAlignment(SwingConstants.CENTER);
        j1.setOpaque(true);
        panels[4].add(j1);

        panels[5].setBackground(new Color(150, 2, 26));
        //创建JLabel组件
        LocalDateTime time = LocalDateTime.now();
        dateLabel = new JLabel(String.valueOf(time));
        panels[5].add(dateLabel);


        //设置第四个面板为GridLayout网格布局，设置背景颜色
        panels[6].setLayout(new GridLayout(4, 6, 5, 5));
        panels[6].setBackground(new Color(138, 244, 154));
        String name;
        for (int i = 1; i <= 26; i++) {
            name = String.valueOf((char) (96 + i)).toUpperCase();
            panels[6].add(new JButton(name));
        }

        panels[7].setBackground(new Color(24, 129, 130));
        String password = "155109";
        jp = new JPasswordField(password, 30);
        //设置回显字符
        jp.setEchoChar('!');
        panels[7].add(jp);



        //设置第四个面板为JScrollPane滚动面板，设置背景颜色
        panels[8].setBackground(new Color(117, 0, 92));
        panels[8].setLayout(new GridLayout(1, 3, 5, 5));
        //创建文本单选按钮
        String[] strings = {"1", "2", "3"};
        for (int i = 0; i < 3; i++) {
            radioButton = new JRadioButton(strings[i]);
            panels[8].add(radioButton);
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new GridLayoutTest();
    }


}
