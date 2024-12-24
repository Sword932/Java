package com.itheima.test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        /*
        需求：键盘录入星期数，显示今天的减肥活动。
        周一：跑步
        周二：游泳
        周三：慢走
        周四：动感单车
        周五：拳击
        周六：爬山
        周日：好好吃一顿
         */
        //1、键盘录入星期数
        Scanner sc = new Scanner(System.in);
        String result = "";  //用来保存减肥活动
        System.out.println("输入周几：");
        String Weeks = sc.next();
        //2、判断并显示今天的今天的减肥活动
        switch (Weeks) {
            case "周一":
                result = "跑步";
                break;
            case "周二":
                result = "游泳";
                break;
            case "周三":
                result = "慢走";
                break;
            case "周四":
                result = "动感单车";
                break;
            case "周五":
                result = "拳击";
                break;
            case "周六":
                result = "爬山";
                break;
            case "周日":
                result = "好好吃一顿";
                break;
        }
        System.out.println("今天是：" + Weeks);
        System.out.println("今天的减肥活动是：" + result);
    }
}
