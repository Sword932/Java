package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /* 需求：考试奖励
        小红：如果你这次考试全班第一，我就做你女朋友。
        小明：
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的名词：");
        int ranking = sc.nextInt();
        if(ranking == 1){
            System.out.println("小红成为小明女朋友！");
        }else {
            System.out.println("小红没有成为小明女朋友！");
        }
    }
}
