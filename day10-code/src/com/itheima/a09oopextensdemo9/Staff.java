package com.itheima.a09oopextensdemo9;

public class Staff {
    private String id;
    private String name;
    private double wages;

    public Staff() {
    }

    public Staff(String id, String name, double wages) {
        this.id = id;
        this.name = name;
        this.wages = wages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public void work(){
        System.out.println("工作");
    }
    public void eat(){
        System.out.println("吃米饭");
    }
}
