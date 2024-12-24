package com.heima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //1、键盘录入用户信息，并添加到集合中
        for(int i = 0; i < 3; i++){
            //创建用户对象
            User u = new User();
            //键盘录入用户信息
            System.out.println("请输入用户id");
            String id = sc.next();
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入用户密码");
            String password = sc.next();
            //将录入信息存入用户对象中
            u.setId(id);
            u.setUsername(username);
            u.setPassword(password);
            //将用户对象添加到集合中
            list.add(u);
        }
        boolean flag = selectId(list, "001");
        System.out.println(flag);
    }

    //定义方法，用于根据id查找对应用户的信息
    public static boolean selectId(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())){
                //如果找到了返回true
                return true;
            }
        }
        //没有找到返回false
        return false;
    }
}
