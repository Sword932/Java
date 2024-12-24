package com.itheima.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame2 extends JFrame implements KeyListener {
    public MyJFrame2() {
        this.setTitle("拼图单机版V1.0");
        this.setSize(550,650);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        //取消默认
        this.setLayout(null);

        //给整个窗口添加键盘监听
        this.addKeyListener(this);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("松开");
        int code = e.getKeyCode();
        char code1 = (char) code;
        System.out.print(code1);

    }
}
