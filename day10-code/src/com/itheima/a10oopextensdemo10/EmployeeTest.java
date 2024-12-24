package com.itheima.a10oopextensdemo10;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("------讲师------");
        Lecturer e1 = new Lecturer("001", "阿伟");
        System.out.println(e1.getId() +", " + e1.getName());
        e1.work();
        System.out.println("------助教------");
        Tutor e2 = new Tutor("002", "张三");
        System.out.println(e2.getId() + ", " + e2.getName());
        e2.work();
        System.out.println("------维护专员------");
        Maintainer e3 = new Maintainer("003", "阿娜");
        System.out.println(e3.getId() + ", " + e3.getName());
        e3.work();
        System.out.println("------采购专员------");
        Buyer e4 = new Buyer("004", "阿狸");
        System.out.println(e4.getId() + ", " + e4.getName());
        e4.work();
    }
}
