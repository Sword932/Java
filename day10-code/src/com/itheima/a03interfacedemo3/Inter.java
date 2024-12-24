package com.itheima.a03interfacedemo3;

public interface Inter {
    public abstract void method();
    public default void show(){
        System.out.println("默认方法");
    }
}
