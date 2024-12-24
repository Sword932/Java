package com.heima.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //添加
        sb.append(1234);
        System.out.println(sb);
        //反转
        sb.reverse();
        System.out.println(sb);
        //获取长度
        int len = sb.length();
        System.out.println(len);

        //把StringBuilder变回字符串
        String s = sb.toString();
        System.out.println(s);
    }
}
