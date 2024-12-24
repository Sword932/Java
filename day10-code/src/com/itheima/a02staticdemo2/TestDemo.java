package com.itheima.a02staticdemo2;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 34, 100};
        System.out.println(ArrayUtil.printArr(arr));
        System.out.println(ArrayUtil.getAerage(arr));

        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 23 , "男");
        Student s2 = new Student("李四", 26, "女");
        Student s3 = new Student("王五", 25, "男");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Student s = ArrayUtil.getMaxAge(list);
        System.out.println(s.getName() + ", " + s.getAge() + ", " + s.getGender());

    }
}
