package com.itheima.test1;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        //输入名字
        gf.setName("章若楠");
        //获取名字
        String name = gf.getName();
        System.out.println("姓名：" + name);

        //输入年龄
        gf.setAge(25);
        //获取年龄
        int age = gf.getAge();
        System.out.println("年龄：" + age);

        //输入性别
        gf.setGender("女");
        //获取性别
        String gender= gf.getGender();
        System.out.println("性别：" + gender);
        //调用吃饭
        gf.eat();
        //调用睡觉
        gf.sleep();
        System.out.println("========================");
        GirlFriend gf1 = new GirlFriend();
        //输入姓名
        gf1.setName("李沁");
        //获取姓名
        String name1 = gf1.getName();
        System.out.println("姓名：" + name1);

        //输入年龄
        gf1.setAge(22);
        //获取年龄
        int age1 = gf1.getAge();
        System.out.println("年龄：" + age1);

        //输入性别
        gf1.setGender("女");
        String gender1 = gf1.getGender();
        System.out.println("性别：" + gender1);
        gf1.eat();
        gf1.sleep();
    }
}
