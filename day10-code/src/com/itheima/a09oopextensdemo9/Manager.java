package com.itheima.a09oopextensdemo9;

public class Manager extends Staff {
    private double ManageBonuses;

    public Manager() {
    }

    public Manager(String id, String name, double wages, double manageBonuses) {
        super(id, name, wages);
        ManageBonuses = manageBonuses;
    }

    public double getManageBonuses() {
        return ManageBonuses;
    }

    public void setManageBonuses(double manageBonuses) {
        ManageBonuses = manageBonuses;
    }
    @Override
    public void work(){
        System.out.println("工作内容：管理其他人");
    }
}
