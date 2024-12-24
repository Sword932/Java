package com.itheima.test;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        /*
        需求：给你一个整数x。
        如果x是一个回文整数，打印true，否则，返回false。
        解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        例如，121是回文，而123不是。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入整数：");
        int num = sc.nextInt();
        //记录输入的整数
        int num2= num;
        //记录输入的是几位数
        int num1 = 1 ;
        //记录反转过来的数
        int result = 0;
        //1、计算输入的整数为几位数
        while(num > 10){
            num = num / 10;
            num1++;
        }
        //2、把整数倒转过来
        for(int i = 1; i <= num1 ; i++){
            result = result + ((num2 % (int)(Math.pow(10, i))) / (int)Math.pow(10, (i-1)))*(int)Math.pow(10, (num1-i));
        }
        //3、判断是否为回文
        if(num2 == result)
            System.out.println("是否为回文：" + true);
        else
            System.out.println("是否为回文："+ false);

        System.out.println(result);
    }
}
