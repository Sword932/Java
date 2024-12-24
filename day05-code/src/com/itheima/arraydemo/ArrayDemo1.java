package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 需求1：定义数据存储5个学生的年龄
        int array1[] = {12, 13, 15, 14, 17};
        for (int i = 0; i < array1.length; i++ )
            System.out.println(array1[i]);
        // 需求2：定义数组存储3个学生的姓名
        String array2[] = {"小明", "小红", "小雅"};
        for (int i = 0; i < array2.length; i++ )
            System.out.println(array2[i]);
        // 需求3：定义数组存储4个学生的身高
        double array3[] = {1.72, 1.82, 1.75, 1.88};
        for (int i = 0; i < array3.length; i++ )
            System.out.println(array3[i]);
    }
}
