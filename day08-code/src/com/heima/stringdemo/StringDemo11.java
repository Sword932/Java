package com.heima.stringdemo;

import java.util.Scanner;

public class StringDemo11 {
    public static void main(String[] args) {
        //使用StringBuilder的场景
        //1、字符串的拼接
        //2、字符串的反转

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        //输入一串字符串
        System.out.println("输入一串字符串：");
        sb.append(sc.next());
        //变成字符串
        String s = sb.toString();
        //反转
        sb.reverse();
        //把反转后的变成字符串
        String s1 = sb.toString();
        if (s.equals(s1)){
            System.out.println("对称字符串");
        } else {
            System.out.println("非对称字符串");
        }
    }
}
