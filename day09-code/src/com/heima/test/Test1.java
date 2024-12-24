package com.heima.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //1、创建集合
        ArrayList<String> list = new ArrayList<>();
        //2、添加字符串
        list.add("剑来");
        list.add("将夜");
        list.add("景天");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() -1){
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.print("]");
    }
}
