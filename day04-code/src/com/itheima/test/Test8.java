package com.itheima.test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        //1、键盘输入面条名称
        Scanner sc = new Scanner(System.in);
        System.out.println("输入您想吃的面条名称：");
        String noodles = sc.next();
        //2、判断想吃哪种面
        switch (noodles) {
            case "兰州拉面":
                System.out.println("兰州拉面做好了！");
                break;
            case "武汉热干面":
                System.out.println("武汉热干面做好了！");
                break;
            case "北京炸酱面":
                System.out.println("北京炸酱面做好了！");
                break;
            case "陕西油泼面":
                System.out.println("陕西油泼面做好了！");
                break;
            default:
                System.out.println("泡面做好了！");
                break;
        }

    }
}
