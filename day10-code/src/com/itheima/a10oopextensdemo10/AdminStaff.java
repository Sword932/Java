package com.itheima.a10oopextensdemo10;

public class AdminStaff extends Employee {
    public AdminStaff() {
    }
    public AdminStaff(String id, String name) {
        super(id, name);
    }
    public void work(){
        System.out.println("行政部员工正在完成行政事务");
    }
}
