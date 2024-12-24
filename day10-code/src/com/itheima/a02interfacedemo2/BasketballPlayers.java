package com.itheima.a02interfacedemo2;

public class BasketballPlayers extends Athlete{
    public BasketballPlayers() {
    }

    public BasketballPlayers(String name, int age) {
        super(name, age);
    }
    @Override
    public void Study() {
        System.out.println("篮球运动员学习打篮球");
    }
}
