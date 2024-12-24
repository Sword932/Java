package com.itheima.Test2;

public class Student {
    private String name;
    private int age;

    //定义一个无参的构造方法
    public Student(){
        System.out.println("这是一个无参构造方法");
    }

    //定义一个带参的构造方法
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void read(){
        System.out.println(name + "正在看书...");
    }
}
