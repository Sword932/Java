package com.itheima.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacher = "爱因斯坦";
        Student s1 = new Student("zhangsan", 23, "男");
        Student s2 = new Student("lisi", 24, "女");
        Student s3 = new Student("wangwu", 25, "男");
        s2.study();
        s2.show();
        s1.study();
        s1.show();
    }
}
