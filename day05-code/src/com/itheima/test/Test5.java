package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        /*
        需求：定义一个数组，存入1，2，3，4，5。按照要求交换索引对应的元素。
        交换前：1,2,3,4,5
        交换后：5,4,3,2,1
         */
        //定义数组
        int[] arr = new int[5];
        System.out.print("交换前: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        // 交换数组
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.print("交换后: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
