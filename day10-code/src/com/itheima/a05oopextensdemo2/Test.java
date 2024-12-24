package com.itheima.a05oopextensdemo2;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Fu{
    String name = "Fu";
    String hobby = "喝茶";
}

class Zi extends Fu{
    String name = "Zi";
    String hobby = "吃鸡";

    public void show(){
        //如何打印zi
        System.out.println(this.name);
        //如何打印Fu
        System.out.println(super.name);
        //如何打印喝茶
        System.out.println(super.hobby);
        //如何打印吃鸡
        System.out.println(this.hobby);
    }
}
