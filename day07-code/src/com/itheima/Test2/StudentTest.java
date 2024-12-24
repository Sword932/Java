package com.itheima.Test2;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student(); //无参构造
        Student st = new Student("马俊海", 25); //带参构造
        System.out.println("姓名：" + st.getName());
        System.out.println("年龄：" + st.getAge());
        st.read();
        System.out.println("=========修改学生信息=========");
        st.setName("张三");
        st.setAge(18);
        System.out.println("姓名：" + st.getName());
        System.out.println("年龄：" + st.getAge());
        st.read();
    }
}
