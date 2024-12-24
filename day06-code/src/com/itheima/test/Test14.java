package com.itheima.test;

import java.util.Scanner;

public class Test14 {
    /* 分析：
    1、定义一个数组，用来存储6位评委的打分(0~100)
    2、求出数组中的最大值
    3、求出数组中的最小值
    4、求出数组中6个分数的总和
    5、（总和 - 最大值 - 最小值）/4
     */
    public static void main(String[] args) {
        //定义数组，用于存储6位评委的打分
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入6位评委的打分：");
        for (int i = 0; i < scores.length;) {
            int score = sc.nextInt();
            if(score >= 0 && score <= 100){
                scores[i] = score;
                i++;
            } else {
                System.out.println("输入分数超出范围：");
            }
        }
        int max = getMax(scores);
        int min = getMin(scores);
        int sum = getSum(scores);
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        System.out.println("总分：" + sum);
        System.out.println("（总和 - 最大值 - 最小值）/4: " + ((sum - max - min) / 4));
    }
    public static int getMax(int[] scores) {
        int max = scores[0];
        //2、求数组中的最大值
        for (int i = 0; i < scores.length; i++) {
            if(max < scores[i]){
                max = scores[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scores) {
        int min = scores[0];
        //3、求数组中的最小值
        for (int i = 0; i < scores.length; i++) {
            if(min > scores[i]){
                min = scores[i];
            }
        }
        return min;
    }
    public static int getSum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
