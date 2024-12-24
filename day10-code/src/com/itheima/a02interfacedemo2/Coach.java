package com.itheima.a02interfacedemo2;

public abstract class Coach extends Person implements Teaching {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    @Override
    public abstract void Teaching();
}
