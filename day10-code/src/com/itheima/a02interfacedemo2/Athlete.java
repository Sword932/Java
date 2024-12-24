package com.itheima.a02interfacedemo2;

public abstract class Athlete extends Person implements Study{
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    @Override
    public abstract void Study();
}
