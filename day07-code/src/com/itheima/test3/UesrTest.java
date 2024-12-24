package com.itheima.test3;

import java.util.Scanner;

public class UesrTest {
    public static void main(String[] args) {
        User u = new User();
        Scanner s = new Scanner(System.in);
        System.out.print("输入用户名：");
        String userName = s.next();
        System.out.print("输入密码：");
        String userPassWord = s.next();
        System.out.print("输入邮箱：");
        String userEmail = s.next();
        System.out.print("输入性别：");
        String sex = s.next();
        System.out.print("输入年龄：");
        int age = s.nextInt();
        u.setUserName(userName);
        u.setUserPassWord(userPassWord);
        u.setEmail(userEmail);
        u.setSex(sex);
        u.setAge(age);
        System.out.println();
        System.out.println("============用户信息===========");
        System.out.println("用户名：" + u.getUserName());
        System.out.println("密码：" + u.getUserPassWord());
        System.out.println("邮箱:" + u.getEmail());
        System.out.println("性别：" + u.getSex());
        System.out.println("年龄:" + u.getAge());
    }
}
