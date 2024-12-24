package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*
        需求：键盘录入一个整数，表示身上的钱。
        如果大于等于100块，就是网红餐厅。
        否则，就吃经济实惠的沙县小吃。
         */
        //1、定义键盘录入钱数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您身上的余额：");
        int money = sc.nextInt();
        if(money >= 100){
            System.out.println("欢迎就餐网红餐厅！");
        }else{
            System.out.println("欢迎就餐沙县小吃！");
        }
    }
}
