package com.itheima.a02interfacedemo2;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void Teaching() {
        System.out.println("篮球教练在教打篮球");
    }
}
