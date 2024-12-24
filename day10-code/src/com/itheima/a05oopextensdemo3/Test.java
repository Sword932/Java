package com.itheima.a05oopextensdemo3;

public class Test {
    public static void main(String[] args) {
        Husky dog1 = new Husky();
        System.out.println("---------哈士奇的行为---------");
        dog1.eat();
        dog1.dink();
        dog1.WatchHome();
        dog1.Dismantling();
        System.out.println("---------沙皮狗的行为---------");
        SharPei dog2 = new SharPei();
        dog2.eat();
        dog2.dink();
        dog2.WatchHome();
        System.out.println("-------中华田园犬的行为-------");
        ChineseRural dog3 = new ChineseRural();
        dog3.eat();
        dog3.dink();
        dog3.WatchHome();

    }
}
class Animal{
    public void eat(){
        System.out.println("吃饭");
    }
    public void dink(){
        System.out.println("喝水");

    }
}
class Dog extends Animal{
    public void WatchHome(){
        System.out.println("看家");
    }
}

class Husky extends Dog{
    @Override
    public void eat(){
        System.out.println("吃狗粮");
    }
    public void Dismantling(){
        System.out.println("拆家");
    }
}

class SharPei extends Dog{
    @Override
    public void eat(){
        System.out.println("吃狗粮、吃骨头");
    }
}

class ChineseRural extends Dog{
    @Override
    public void eat(){
        System.out.println("吃剩饭");
    }
}
