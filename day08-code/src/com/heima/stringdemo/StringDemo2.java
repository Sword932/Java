package com.heima.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        //1、创建两个字符串对象
        String s1 = new String("abc");
        String s2 = "ABC";

        System.out.println(s1 == s2);  //false
        //区分大小写
        System.out.println(s1.equals(s2)); //false
        //忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2)); //true
    }
}
