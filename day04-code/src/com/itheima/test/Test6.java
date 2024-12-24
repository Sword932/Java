package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //1、键盘录入成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("输入您的成绩：");
        int score = sc.nextInt();
        //2、判断录入成绩是否在合理范围内
        if (score >= 0 && score <= 100) {
            //3、判断成绩档次，进行奖励或惩罚
            if(score >= 95) {
                System.out.println("奖励一辆自行车！");
            } else if(score >= 90 && score <= 94){
                System.out.println("奖励游乐园玩一天！");
            } else if(score >= 80 && score <= 89){
                System.out.println("奖励一个变形金刚！");
            } else {
                System.out.println("被打一顿！");
            }
        } else {
            System.out.println("请输入有效成绩(0~100)！！！！");
        }
    }
}
