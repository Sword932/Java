package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        /*
        需求：定义一个方法，求长方形的周长，将结果在方法中进行打印。
         */
        perimeter(10.5, 5);
    }
    public static void perimeter(double tall, double wide){
        double per = (tall + wide) * 2;
        System.out.println("周长为：" + per);
    }
}
