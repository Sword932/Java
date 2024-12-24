package com.itheima.test;

import java.util.Random;

public class Test13 {
    /*
     需求：定义方法实现随机产生一个5位的验证码
     验证码格式：
     长度为5
     前四位是大写字母或者小写字母
     最后一位是数字
     */
    public static void main(String[] args) {

        //把大写字母和小写字母都放入到数组中
        char[] chs1 = new char[52];
        for (int i = 0; i < chs1.length; i++) {
            if(i <= 25){
                chs1[i] = (char)( 97 + i);
            } else {
                chs1[i] = (char)( 65 + i - 26);
            }
        }

        // 根据随机索引抽出数组中的随机字母
        System.out.println();
        // 定义一个数组用于保存前四个字母验证码
        char[] st = new char[4];
        Random r = new Random();
        // 随机获取验证码最后一位数字
        int number = r.nextInt(1,10);
        for (int i = 0; i < 4; i++){
            int index = r.nextInt(0,52);
            st[i] = chs1[index];
        }
        // 获取前四个字母验证码并放入数组中
        System.out.print("验证码：");
        for (int i = 0; i < 4; i++) {
            System.out.print(st[i]);
        }
        System.out.print(number);

    }
}
