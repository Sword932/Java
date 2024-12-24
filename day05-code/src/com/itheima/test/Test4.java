package com.itheima.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*
        需求：生成10个1~100之间的随机数存入数组。
        1）求出所有数据的和
        2）求所有数据的平均数
        3）统计有多少个数据比平均值小
         */

        //定义数组
        int[] arr = new int[10];
        //随机数
        Random r = new Random();
        //生成10个随机数,并用数组保存
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(1, 101);
            System.out.println("生成数：" + num);
            arr[i] = num;
        }
        // 计算所有数据的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum =  sum + arr[i];
        }
        System.out.println("所有数据的和为：" + sum);
        //求出所有数据的平均数
        int average;
        average = sum / arr.length;
        System.out.println("平均数为：" + average);
        //统计有多少个数据比平均值小
        int jisuan = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < average){
                jisuan++;
            }
        }
        System.out.println("一共有" + jisuan + "个数据比平均值小");
    }
}
