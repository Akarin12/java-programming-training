package com.soft1841.jpt.swing;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import javax.swing.*;
import java.awt.*;

/**
 * 空布局
 * 2019.3.28
 */
public class LoginFrame extends JFrame {
    private  JLabel accoutLabel ,passwordLabel ;
    private  JTextField accountField;
    private  JPasswordField passwordField;
    private  JButton comfirmButton ;
    private JButton cancleButton;
    private  JLabel bgLabel;
    public LoginFrame(){
        init();
        setTitle("登陆窗体");
        setSize(430,330);
        setLocationRelativeTo(null);
        //窗口大小不可变
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public  void init(){
        Font font = new Font("宋体",Font.PLAIN,16);
        accoutLabel = new JLabel("账号");
        accoutLabel.setFont(font);
        accountField = new JTextField();
        accountField.setFont(font);
        passwordLabel = new JLabel("密码");
        passwordLabel.setFont(font);
        passwordField = new JPasswordField();
        passwordField.setFont(font);
        cancleButton = new JButton("取消");
        comfirmButton = new JButton("登陆");
        comfirmButton.setFont(font);
        cancleButton.setFont(font);
        //窗口布局设为空布局，需要给每个组件定位
        setLayout(null);
        //setBounds 方法的四个参数分别为组件x、y坐标，组件宽高
        accoutLabel.setBounds(30,60,100,35);
        accountField.setBounds(90,60,300,35);
        passwordLabel.setBounds(30,140,100,35);
        passwordField.setBounds(90,140,300,35);

        comfirmButton.setBounds(100,220,70,30);
        comfirmButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.blue));
        cancleButton.setBounds(280,220,70,30);
        cancleButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        add(accoutLabel);
        add(accountField);
        add(passwordLabel);
        add(passwordField);
        add(comfirmButton);
        add(cancleButton);
        //背景
        bgLabel = new JLabel();
        Icon bgicon = new ImageIcon(LoginFrame.class.getResource("/img/bback.jpg"));
        bgLabel.setIcon(bgicon);
        bgLabel.setBounds(0,0,640,480);
        add(bgLabel);


    }

    public static void main(String[] args) {
        //用beautyeye样式
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }
        new LoginFrame();

    }


}