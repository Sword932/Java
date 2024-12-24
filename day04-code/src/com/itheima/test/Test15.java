package com.itheima.test;

public class Test15 {
    public static void main(String[] args) {
        // 需求：求1-100之间的偶数和

        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                sum = sum + i;
                System.out.println("i = " + i + ", sum = " + sum);
            }
        }
        System.out.println("1-100之间的偶数和：" + sum);
    }
}
