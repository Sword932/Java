package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*
        需求：商场都会有VIP的会员制，根据不同的会员会有不同的折扣。
        假设商品总价为1000。
        键盘录入会员级别，并计算出实际支付的钱。
        会员1级：打9折。
        会员2级：打8折。
        会员3级：打7折。
        非会员：不打折。
         */
        //1、键盘录入会员级别
        double money = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入会员等级(1~3)：");
        int vipRank = sc.nextInt();
        //2、判断会员等级是否合理
        if(vipRank >= 1 && vipRank <= 3){
            //3、判断打几折，并输入最终需要支付的金额
            if(vipRank == 1) {
                money = money * 0.9;
            } else if(vipRank == 2) {
                money = money * 0.8;
            } else {
                money = money * 0.7;
            }
        }
        System.out.println("您最终主要支付："  + money + " 元。");

    }
}
