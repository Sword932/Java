package com.itheima.test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int[][] location = new int[4][4];
        Random r = new Random();
        //定义数组用来保存图片名
        int[] arrIndex = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int temp;
        //打乱图片顺序
        for (int i = 0; i < arrIndex.length; i++) {
            int index = r.nextInt(0, 16);
            temp = arrIndex[i];
            arrIndex[i] = arrIndex[index];
            arrIndex[index] = temp;
        }
        for (int i = 0; i < arrIndex.length; i++) {
            if(arrIndex[i] == 0){
                x = i / 4;
                y = i % 4;
            } else {
                location[i / 4][i % 4] = arrIndex[i];
            }
        }
        for (int i = 0; i < arrIndex.length; i++) {
            System.out.print(location[i / 4][i % 4] + " ");
        }
        System.out.println();
        System.out.println(x + " " + y);
    }
}
