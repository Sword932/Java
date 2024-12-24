package com.itheima.a09oopextensdemo9;

public class Cook extends Staff{
    public Cook() {
    }

    public Cook(String id, String name, double wages) {
        super(id, name, wages);
    }

    @Override
    public void work(){
        System.out.println("工作内容：炒菜");
    }
}
