package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        JFrame gameGFrame = new JFrame();
        //设置界面大小
        gameGFrame.setSize(550, 640);
        //设置界面置顶
        gameGFrame.setAlwaysOnTop(true);
        //设置界面居中
        gameGFrame.setLocationRelativeTo(null);
        //设置界面关闭方式
        gameGFrame.setDefaultCloseOperation(3);
        //取消默认方式
        gameGFrame.setLayout(null);

        //创建按钮
        JButton jtb = new JButton("点我啊");
        //设置按钮的位置和大小
        jtb.setBounds(0, 0, 100, 50);
        //添加按钮组件（动作监听包括鼠标左键点击、空格）
        //参数：表示事件被触发之后要执行的代码
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点一下！");
            }
        });

        //将按钮添加到界面当中
        gameGFrame.getContentPane().add(jtb);

        //显示界面
        gameGFrame.setVisible(true);

    }
}
