package com.itheima.test;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个大于等于2的整数：");
        int x = sc.nextInt();
        int count = 0;
        int demp = 0;
        for (int i = 1; count < x; i++){
            if((i-1) * (i-1) < x && i * i > x){
                break;
            }
            count = i * i;
            demp++;

        }
        System.out.println(x + "的算数平方根为：" + demp);

    }
}
