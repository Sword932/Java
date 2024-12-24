package com.itheima.test;

public class Test10 {
    /*
    需求：定义一个方法copyOfRange(int[] arr,int from,int to)
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int from = 3;
        int to = 8;
        int[] newArr = copyArray(arr, 3, 8);
        System.out.print("[");
        for (int i = 0; i < newArr.length; i++) {
            if(i == newArr.length - 1){
                System.out.print(newArr[i]);
            } else {
                System.out.print(newArr[i] + ", ");
            }
        }
        System.out.print("]");
    }

    public static int[] copyArray(int[] arr, int from, int to) {
        int[] newArr = new int[(to - from)];
        int demp = 0;
        if(to <= arr.length){
            for (int i = from; i < to; i++) {
                newArr[demp] = arr[i];
                demp++;
            }
        } else {
            System.out.println("超出范围");
        }

        return newArr;
    }
}
