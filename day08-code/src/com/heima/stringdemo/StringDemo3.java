package com.heima.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        /*
        需求：已知正确的用户名和密码，请用程序实现模拟用户登录。
        总共给三次机会，登录之后，给出相应的提示。
         */
        String userTrue = "zhangsan";
        String passWord = "abc123";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("请输入用户名：");
            String user = sc.next();
            System.out.println("请输入密码：");
            String pass = sc.next();
            if(userTrue.equals(user) && passWord.equals(pass)){
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("密码或账号错误，请重新输入！还剩下"+ (2-i) + "次机会。");
            }
        }
    }
}
