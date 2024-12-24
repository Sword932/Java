package com.itheima.a03interfacedemo3;

public class InterImpl implements Inter {
    @Override
    public void method() {
        System.out.println("重写接口中的method方法！");
    }

    @Override
    public void show() {
        System.out.println("重写show拓展方法！");
    }
}
