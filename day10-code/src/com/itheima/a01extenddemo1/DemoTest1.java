package com.itheima.a01extenddemo1;

public class DemoTest1 {
    public static void main(String[] args) {
        //创建布偶猫类
        RagdollCat rc = new RagdollCat();
        //调用布偶猫的三个行为
        rc.eat();
        rc.drink();
        rc.CatchMice();

        System.out.println("=============================");
        //创建泰迪类
        Teddy td = new Teddy();
        //调用泰迪的四个行为
        td.eat();
        td.drink();
        td.HouseKeeping();
        td.Dawdling();
    }
}
