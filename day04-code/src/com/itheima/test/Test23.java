package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        /*
        需求：程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少？
         */
        //1、获取随机数
        Random r = new Random();
        int number = r.nextInt(7, 15);
        //2、猜数字
        System.out.println("猜数字：");
        Scanner sc = new Scanner(System.in);
        for ( ; ; ){
            int number1 = sc.nextInt();
            if(number1 > number) {
                System.out.println("猜大了！");
            } else if(number1 < number) {
                System.out.println("猜小了！");
            } else {
                System.out.println("猜对了！正确答案是：" + number1);
                break;
            }
        }
    }
}
