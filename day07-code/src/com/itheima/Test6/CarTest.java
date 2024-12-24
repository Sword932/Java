package com.itheima.Test6;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        //1、键盘录入汽车信息，并创建三个汽车对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个汽车的信息(品牌、价格、颜色)：");
        Car c1 = new Car(sc.next(), sc.nextDouble(), sc.next());
        System.out.println("请输入第二个汽车的信息(品牌、价格、颜色)：");
        Car c2 = new Car(sc.next(), sc.nextDouble(), sc.next());
        System.out.println("请输入第三个汽车的信息(品牌、价格、颜色)：");
        Car c3 = new Car(sc.next(), sc.nextDouble(), sc.next());
        //2、将汽车对象添加到汽车数组中
        arr[0] = c1;
        arr[1] = c2;
        arr[2] = c3;
        System.out.println("====================汽车信息=======================");
        //遍历，并输出汽车信息
        for (int i = 0; i < arr.length; i++) {
            System.out.println("品牌：" + arr[i].getName() + "\t 价格(万)：" + arr[i].getPrice() + "\t 颜色：" + arr[i].getColor());
        }
    }
}
