package com.itheima.test;

public class Test9 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 8, 4, 15, 6, 7, 12};
        //调用方法变保存接收值
        boolean num = boolNumber(arr, 9);
        System.out.println("是否在数组里：" + num);
    }

    //定义判断数是否存在数组中的方法
    public static boolean boolNumber(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
