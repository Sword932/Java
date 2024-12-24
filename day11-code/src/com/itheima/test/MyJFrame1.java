package com.itheima.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame1 extends Frame implements MouseListener {
    public MyJFrame1() {
        JFrame Jframe = new JFrame();
        //设置大小
        Jframe.setSize(550,650);
        //置顶
        Jframe.setAlwaysOnTop(true);
        //居中
        Jframe.setLocationRelativeTo(null);
        //关闭方式
        Jframe.setDefaultCloseOperation(3);
        //标题
        Jframe.setTitle("拼图单机版V1.0");
        //取消默认
        Jframe.setLayout(null);
        //创建按钮
        JButton jtb = new JButton("登录");
        jtb.setBounds(0, 0, 100,50);
        jtb.addMouseListener(this);
        Jframe.getContentPane().add(jtb);

        //显示
        Jframe.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
