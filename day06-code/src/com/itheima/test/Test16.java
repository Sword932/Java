package com.itheima.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要解密的数据：");
        int passNumber = sc.nextInt();
        //1、统计数组长度 + 反转
        int[] number = getNum(passNumber);
        //2、解密 + 拼接
        int result = getPass(number);
        System.out.println("解密后的数据：" + result);
    }
    public static int[] getNum(int passNumber) {
        int demp = passNumber;
        int sum = 0;
        //统计数组长度
        while (demp > 0) {
            demp = demp / 10;
            sum++;
        }
        int[] number = new int[sum];
        //将数据进行反转操作
        for (int i = 0; i < number.length; i++) {
            number[i] = passNumber % 10;
            passNumber = passNumber / 10;
        }
        return number;
    }

    public static int getPass(int[] number) {

        //进行反%10操作
        for (int i = 0; i < number.length; i++) {
            if(number[i] < 5){
                number[i] = number[i] + 10;
            }
        }

        //进行反+5操作
        for (int i = 0; i < number.length; i++) {
            number[i] = number[i] - 5;
        }

        //将破解的密码进行拼接
        int num = 0;
        for (int i = 0; i < number.length; i++) {
            num = num * 10 +  number[i];
        }

        return num;
    }
}
