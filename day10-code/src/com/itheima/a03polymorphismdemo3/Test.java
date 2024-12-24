package com.itheima.a03polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Animal a1 = new Cat(3, "灰");
        Animal a2 = new Dog(2, "黑");
        p1.setName("老王");
        p1.setAge(30);
        p1.keepPet(a2, "骨头");
        p2.setName("老李");
        p2.setAge(25);
        p2.keepPet(a1, "鱼");

    }
}
