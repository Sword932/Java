package com.itheima.test;

public class Test12 {
    public static void main(String[] args) {
        type();
    }

    public static void type() {
        int sum = 0;
        System.out.print("是质数的数字：");
        for (int i = 101; i <= 200; i++){
            boolean flag = true;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.print(i + "、");
                sum++;
            }
        }
        System.out.println();
        System.out.println("一共" + sum + "个质数。");
    }
}
