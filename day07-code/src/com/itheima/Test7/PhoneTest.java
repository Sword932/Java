package com.itheima.Test7;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        //1、创建手机对象
        Phone p1 = new Phone("小米15", 4599, "白色");
        Phone p2 = new Phone("苹果16", 5999, "暗夜紫");
        Phone p3 = new Phone("华为p70", 8999, "黑色");
        //2、把手机对象加入手机数组
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        //3、遍历，计算出三个手机的均价
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
             sum = sum + arr[i].getPrice();
        }
        System.out.println("三个手机的均价：" + sum/arr.length);
    }
}
