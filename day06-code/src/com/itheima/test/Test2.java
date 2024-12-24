package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("a");
        System.out.println("b");
        method1();
    }
    public static void method1(){
        System.out.println("c");
        System.out.println("d");
        method2();
    }
    public static void method2(){
        System.out.println("e");
        System.out.println("f");
    }
}
