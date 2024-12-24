package com.itheima.test;

public class Test5 {
    /*
    需求：定义一个方法，求圆的面积，将结果在方法中进行打印
     */
    public static void main(String[] args) {
        getArea(1.5);
    }
    public static void getArea(double r){
        double pai = 3.1415926;
        double area = pai * r * r;
        System.out.println("圆的面积为：" + area);
    }
}
