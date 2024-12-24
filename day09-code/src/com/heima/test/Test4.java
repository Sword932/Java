package com.heima.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);

        //添加list元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        //遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print(list.get(i).getName() + " " + list.get(i).getAge());
            } else {
                System.out.print(list.get(i).getName() + " " + list.get(i).getAge() + ",");
            }
        }
        System.out.println("]");
    }
}
