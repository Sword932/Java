package com.itheima.test;

public class PhoneTest {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.brand = "小米15";
        ph.price = 4499;
        System.out.println("=========================================");
        System.out.println("品牌：" + ph.brand + " 价格：" + ph.price);
        System.out.println("=========================================");
        System.out.println("下面是该手机的功能：");
        System.out.println("=========================================");
        ph.call();
        System.out.println("=========================================");
        ph.sendMessage();
        System.out.println("=========================================");
        ph.playGame();
        System.out.println("=========================================");
    }
}
