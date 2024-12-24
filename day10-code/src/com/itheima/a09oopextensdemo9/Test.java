package com.itheima.a09oopextensdemo9;

public class Test {
    public static void main(String[] args) {
        Manager m1 = new Manager("001", "张三", 5999, 850);
        System.out.println("---------经理信息--------");
        System.out.println(m1.getId() + ", " + m1.getName() + ", " + m1.getWages() + ", " + m1.getManageBonuses());
        m1.work();
        m1.eat();
        Cook c1 = new Cook("002", "李四", 4999);
        System.out.println("---------厨师信息--------");
        System.out.println(c1.getId() + ", " + c1.getName() + ", " + c1.getWages());
        c1.work();
        c1.eat();
    }
}
