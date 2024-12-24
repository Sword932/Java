package com.itheima.test;

public class Test3 {
    /*
    需求：定义一个方法，在方法内部定义两个变量。
    求出他们的和并进行打印
     */
    public static void main(String[] args) {
        add(9, 2);
    }
    public static void add(int num1, int num2){
        int number = num1 + num2;
        System.out.println("两数之和：" + number);
    }
}
