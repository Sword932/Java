package com.itheima.test;

public class Test6 {
    /*
    需求：定义方法，比较两个长方形的面积。
     */
    public static void main(String[] args) {
        double area1 = getArea(10, 5);
        double area2 = getArea(7, 8);
        if (area1 > area2)
            System.out.println("长方形1的面积大");
        else
            System.out.println("长方形2的面积大");
    }
    public static double getArea(double tall, double wide){
        double area = tall * wide;
        return area;
    }
}
