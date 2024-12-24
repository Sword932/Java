package com.itheima.test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        /*
        需求：定义一个数组，存入1~5。要i去打乱数组中所有数据的顺序。
         */
        //定义数组
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        //定义随机数，作为数组下标，随机进行交换
        Random r = new Random();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int r1 = r.nextInt(0, 5);
            //随机交换数组的值
            temp = arr[i];
            arr[i] = arr[r1];
            arr[r1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
