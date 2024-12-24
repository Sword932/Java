package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        //1、定义数组
        int [] num = {11, 22, 33, 44, 55};

        //调用遍历方法
        printArr(num);
    }


    //定义方法用于数组遍历
    public static void printArr(int[] num) {
        System.out.print("[");
        for (int i = 0; i < num.length; i++) {
            if(i == num.length -1){
                System.out.print(num[i]);
            } else {
                System.out.print(num[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
