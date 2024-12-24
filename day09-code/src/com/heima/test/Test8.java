package com.heima.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        //1、创建三个手机对象
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);
        //2、将手机对象添加入集合中
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> newList = selectPrice(list);
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i).getBrand() + "  " + newList.get(i).getPrice());
        }
    }
    public static ArrayList<Phone> selectPrice(ArrayList<Phone> list) {
        ArrayList<Phone> returnList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() < 3000){
                returnList.add(list.get(i));
            }
        }
        return returnList;
    }
}
