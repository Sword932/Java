package com.itheima.a10oopextensdemo10;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("助教正在进行辅助讲师的工作");
    }
}
