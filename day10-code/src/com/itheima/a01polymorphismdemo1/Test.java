package com.itheima.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("张三", 18);
        Teacher t = new Teacher("王建国", 33);
        Administrator a = new Administrator("管理员", 35);
        register(s);
        register(t);
        register(a);
    }
    public static void register(Person p) {
        p.show();
    }
}

