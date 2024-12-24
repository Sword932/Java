package com.heima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        //从键盘输入学生信息并添加到集合中
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            //1、创建学生类
            Student s = new Student();
            //2、从键盘输入学生信息，并修改学生对象中的信息
            System.out.println("请输入学生的姓名：");
            String name = sc.next();
            System.out.println("请输入学生的年龄：");
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);
            //3、将创建的学生类添加到集合中
            list.add(s);
        }

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print("姓名：" + list.get(i).getName() + "\t年龄：" + list.get(i).getAge());
            } else {
                System.out.print("姓名：" + list.get(i).getName() + "\t年龄：" + list.get(i).getAge() + ",\t");
            }
        }
        System.out.print("]");
    }
}
