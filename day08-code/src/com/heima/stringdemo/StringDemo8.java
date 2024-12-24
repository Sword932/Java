package com.heima.stringdemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话号码：");
        String phoneNumber = sc.next();
        String phone = shieldPhone(phoneNumber);
        System.out.println("=================================");
        System.out.println(phone);
    }

    public static String shieldPhone(String phoneNumber) {
        String phone = "";
        String afterPhone = phoneNumber.substring(0, 3);
        String backPhone = phoneNumber.substring(7, 11);
        phone = afterPhone + "****" + backPhone;
        return  phone;
    }
}
