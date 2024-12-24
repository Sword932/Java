package com.itheima.test;

import java.util.Scanner;

public class Test22 {
    public static void main(String[] args) {
        /*
        需求：键盘录入一个正整数x, 判断该整数是否为一个质数。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个正整数：");
        boolean zhishu = true;
        int x = sc.nextInt();
        for (int i = 2; i < x; i++){
            if(x % i == 0){
                zhishu = false;
                break;
            }
        }
        if(zhishu)
            System.out.println(x + "是一个质数！");
        else
            System.out.println(x + "不是一个质数！");
    }
}
