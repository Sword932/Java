package com.itheima.test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        /*
        需求：键盘录入星期数，输出工作日、休息日。
        (1-5)工作日, (6-7)休息日。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入周几：");
        int weeks = sc.nextInt();
        //使用if
        if(weeks >= 1 && weeks <= 5){
            System.out.println("工作日！");
        } else if (weeks >= 6 && weeks <= 7){
            System.out.println("休息日！");
        } else {
            System.out.println("输入的周数不合理！");
        }
        //使用switch
        switch (weeks){
            case 1,2,3,4,5 -> {
                System.out.println("这是工作日！");
            }
            case 6,7 -> {
                System.out.println("这是休息日！");
            }
            default -> {
                System.out.println("输入不合理！");
            }
        }
    }
}
