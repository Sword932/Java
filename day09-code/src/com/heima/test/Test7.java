package com.heima.test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        //1、创建三个用户类
        User u1 = new User("001", "zhangsan", "123456");
        User u2 = new User("002", "lisi", "654321");
        User u3 = new User("003", "wangwu", "654123");

        //将三个用户类添加入集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //使用contain方法，根据id查找用户信息
        int index = contain(list, "001");
        System.out.println(index);
    }

    //根据id查找用户信息，如果查到返回索引，查不到返回-1
    public static int contain(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())){
                //查到，返回索引值
                return i;
            }
        }
        //查不到，返回-1
        return -1;
    }
}
