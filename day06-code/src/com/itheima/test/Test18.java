package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] redTrue = new int[6];
        int blueTrue = r.nextInt(1, 17);
        //随机获取蓝色中奖号码
        for (int i = 0; i < redTrue.length; i++) {
            redTrue[i] = r.nextInt(1, 34);
        }
        Scanner sc = new Scanner(System.in);
        //随机获取红色中奖号码
        int[] redUser = new int[6];
        //获取用户购买的红色号码，并控制在合法范围。
        System.out.println("请输入您的红色中奖号码：(1-33)");
        for (int i = 0; i < redUser.length; ) {
            int temp = sc.nextInt();
            if(temp <= 33 && temp >= 1){
                redUser[i] = temp;
                i++;
            } else {
                System.out.println("输入超出范围，请重新输入！");
            }
        }
        //控制蓝色球输入在合法范围。
        System.out.println("请输入您的蓝色中奖号码：(1-16)");
        int temp = sc.nextInt();
        while (temp < 1 && temp > 16){
            temp = sc.nextInt();
        }
        int blueUser = temp;
        //统计红色球中奖个数
        int redSum = 0;
        for (int i = 0; i < redUser.length; i++) {
            for (int i1 = 0; i1 < redTrue.length; i1++) {
                if(redUser[i] == redTrue[i1]){
                    redSum++;
                    redTrue[i] = 0;
                }
            }
        }
        //统计蓝色球中奖个数
        int blueSum = 0;
        if(blueUser == blueTrue){
            blueSum++;
        }
        System.out.println("红球中奖的数量：" + redSum);
        System.out.println("蓝球中奖的数量：" + blueSum);
        if(blueSum == 1 && redSum >= 0 && redSum <= 2){
            System.out.println("恭喜您中了六等奖！奖金5元！");
        } else if( (redSum == 3 && blueSum == 1 ) || (redSum == 4 && blueSum == 0 ) ){
            System.out.println("恭喜您中了五等奖！奖金10元！");
        } else if( (redSum == 4 && blueSum == 1 ) || (redSum == 5 && blueSum == 0 ) ){
            System.out.println("恭喜您中了四等奖！奖金200元！");
        } else if( (redSum == 5 && blueSum == 1 ) ){
            System.out.println("恭喜您中了三等奖！奖金3000元！");
        } else if( (redSum == 6 && blueSum == 0 ) ){
            System.out.println("恭喜您中了二等奖！奖金500万！");
        } else if( (redSum == 6 && blueSum == 1 ) ){
            System.out.println("恭喜您中了一等奖！奖金1000万！");
        } else {
            System.out.println("不好意思，您没有中奖！");
        }
    }
}
