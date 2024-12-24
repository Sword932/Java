package com.itheima.test;

public class Test19 {
    public static void main(String[] args) {
        /*
        需求：给定两个整数，被除数和除数(都是正数，且不超过int的范围)。
        将两数相除，要求不使用乘法、除法和%运算符。
        得到商和余数。
         */
        int num1 = 120;
        int num2 = 240;
        System.out.println("真实商为：" + num2 / num1 + ", 真实余数为：" + num2 % num1);
        int shang = 0;
        int yushu = 0;
        while(num2 >= num1){
            num2 = num2 - num1;
            shang++;
        }
        yushu = num2;
        System.out.println("商为：" + shang + ", 余数为：" + yushu);
    }
}
