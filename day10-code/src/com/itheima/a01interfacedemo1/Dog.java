package com.itheima.a01interfacedemo1;

public class Dog extends Animal implements Swim {
    @Override
    public void swim() {
        System.out.println("狗正在狗刨");
    }

    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }
}
