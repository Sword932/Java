package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        //定义数组
        int arr[] = {33, 5, 22, 44, 55};
        //初始化最大值
        int max = arr[0];
        //如果元素大于最大值，就把元素值赋值给最大值
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值为：" + max);
    }
}
