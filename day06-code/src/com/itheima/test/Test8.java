package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        //1、定义数组
        int[] arr = {11, 22, 66, 44, 55};
        //3、调用求数组最大值的方法
        int maxNumber = getMaxNumber(arr);
        System.out.println("最大值为：" + maxNumber);
    }

    //2、定义求数组中最大值的方法
    public static int getMaxNumber(int[] arr) {
        int demp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (demp < arr[i]) {
                demp = arr[i];
            }
        }
        return demp;
    }
}
