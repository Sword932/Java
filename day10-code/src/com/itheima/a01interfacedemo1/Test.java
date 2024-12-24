package com.itheima.a01interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Rabbit r = new Rabbit("小白", 2);
        r.eat();
        r.drink();
        Frog f = new Frog("小绿", 3);
        f.drink();
        f.eat();
        f.swim();
        Dog d = new Dog();
        d.swim();
        d.eat();
    }
}
