package com.itheima.test1;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age >= 18 && age <=60){
            this.age = age;
        } else {
            System.out.println("年龄输入有误！");
        }
    }
    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void eat(){
        System.out.println(name + "正在吃饭中...");
    }
    public void sleep() {
        System.out.println(name + "正在睡觉中...");
    }
}
