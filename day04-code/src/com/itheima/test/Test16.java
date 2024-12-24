package com.itheima.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        /*
        需求：键盘录入两个数字，表示一个范围。
        统计这个范围中。
        既能被3整除，又能被5整除数字有多少个？
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入起始数字：");
        int startNumber = sc.nextInt();
        System.out.println("输入结束数字：");
        int endNumber = sc.nextInt();
        //定义变量记录 既能被3整除，又能被5整除数字数量
        int sum = 0;
        //判断两个数字哪个大
        if(startNumber <= endNumber){
            //第二个数字大
            for (int i = startNumber; i <= endNumber; i++){
                if(i % 3 == 0 && i % 5 == 0){
                    sum++;
                    System.out.println(i);
                }
            }
        } else {
            //第一个数字大
            for (int i = endNumber; i <= startNumber; i++){
                if(i % 3 == 0 && i % 5 == 0){
                    sum++;
                    System.out.println(i);
                }
            }
        }
        System.out.println("既能被3整除，又能被5整除数字一共：" + sum);
    }
}
