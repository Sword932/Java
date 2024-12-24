package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*
        需求：假设影院卖了100张票，票号为1~100
        其中奇数票号坐左侧，偶数票号坐右侧。
        键盘录入一个整数表示电影院的票号。
        根据不同情况，给出不同的提示：
        如果票号为奇数，那么打印坐左边
        如果票号为偶数，那么打印坐右边
         */
        //1、键盘录入电影院的票号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的票号(1~100)：");
        int num = sc.nextInt();
        //2、判断票号的输入是否在正确范围内
        if(num >= 1 && num <= 100) {
            //3、判断坐在左边还是右边
            if (num % 2 == 0) {
                System.out.println("您坐在右边！");
            } else {
                System.out.println("您坐在左边！");
            }
        } else {
            System.out.println("您的票号有误，请输入1~100的票号！！！");
        }
    }
}
