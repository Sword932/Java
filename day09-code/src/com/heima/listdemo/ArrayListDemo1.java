package com.heima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //1、添加元素
        list.add("aaa"); //true
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //2、删除元素
//        list.remove("ddd");//true
//        list.remove(1);  //bbb

        //3、修改元素
        list.set(0, "eee"); //返回被修改的值 aaa
        System.out.println(list);

        //4、查询元素

        for (int i = 0; i < list.size(); i++) {
            String result = list.get(i);
            System.out.println(result);
        }

    }
}
