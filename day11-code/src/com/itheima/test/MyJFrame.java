package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener{
    JButton jtb1 = new JButton();
    JButton jtb2 = new JButton();
    public MyJFrame(){
        JFrame Jframe = new JFrame();
        //设置大小
        Jframe.setSize(550,650);
        //置顶
        Jframe.setAlwaysOnTop(true);
        //关闭模式
        Jframe.setDefaultCloseOperation(3);
        //居中
        Jframe.setLocationRelativeTo(null);
        //取消默认
        Jframe.setLayout(null);


        jtb1.setBounds(0, 0, 100, 50);
        jtb1.addActionListener(this);
        Jframe.getContentPane().add(jtb1);

        jtb2.setBounds(100, 0, 100, 50);
        jtb2.addActionListener(this);
        Jframe.getContentPane().add(jtb2);

        Jframe.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //对当前按钮进行判断
        Object source =  e.getSource();
        if(source == jtb1){
            jtb1.setSize(250, 250);
        } else if(source == jtb2){
            Random r = new Random();
            jtb2.setLocation(r.nextInt(100, 500),r.nextInt(100, 500));
        }
    }
}
