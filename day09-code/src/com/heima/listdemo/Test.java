package com.heima.listdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void startStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的选择：");
        int select;
        //如果不选择退出，则一直执行菜单
        do {
            Student s = new Student();
            System.out.println("------------------欢迎来到黑马学习管理系统---------------------");
            System.out.println("1、添加学生");
            System.out.println("2、删除学生");
            System.out.println("3、修改学生");
            System.out.println("4、查找学生");
            System.out.println("5、退出");
            System.out.println("请输入您的选择：");
            select = sc.nextInt();
            menu(list,s,select);
        }while (select != 5);
    }

    public static void menu(ArrayList<Student> list,Student s,int select) {
        Scanner sc = new Scanner(System.in);
        if(select == 1){//执行添加功能
            System.out.println("请输入学生id");
            s.setId(sc.next());
            System.out.println("请输入学生姓名");
            s.setName(sc.next());
            System.out.println("请输入学生年龄");
            s.setAge(sc.nextInt());
            System.out.println("请输入学生家庭地址");
            s.setHomeAddress(sc.next());
            System.out.println(list.size());
            add(list, s);
        }
        if(select == 2){//执行删除功能
            System.out.println("请输入要删除学生的id");
            String id = sc.next();
            delete(list, id);

        }
        if(select == 3){//执行修改功能
            System.out.println("请输入要修改学生的id");
            String id = sc.next();
            modify(list, id);

        }
        if (select == 4){//执行查询功能
            find(list);
        }
    }

    public static void add(ArrayList<Student> list, Student s) {
        for (int i = 0; i < list.size(); i++) {
            if(s.getId().equals(list.get(i).getId())){
                System.out.println("学生id重复，请重新输入！");
                return;
            }
        }
        list.add(s);
    }

    public static void find(ArrayList<Student> list) {
        if (list.size() != 0){
            System.out.println("id" + "\t姓名" + "\t年龄" + "\t家庭住址");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getId() + "\t" + list.get(i).getName() + "\t" + list.get(i).getAge() + "\t" + list.get(i).getHomeAddress());
            }
        } else {
            System.out.println("当前无学生信息，请添加后再查询");
        }
    }

    public static void modify(ArrayList<Student> list, String id) {// 修改功能
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            Student s = new Student();
            if(id.equals(list.get(i).getId())){
                System.out.println("请输入要修改学生的信息");
                System.out.println("请输入学生id");
                s.setId(sc.next());
                System.out.println("请输入学生姓名");
                s.setName(sc.next());
                System.out.println("请输入学生年龄");
                s.setAge(sc.nextInt());
                System.out.println("请输入学生家庭地址");
                s.setHomeAddress(sc.next());
                list.set(i, s);
                System.out.println("修改成功！");
                return;
            }
        }
        System.out.println("找不到该学号的学生，修改失败！");
    }

    public static void delete(ArrayList<Student> list, String id) { //删除功能
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())){
                list.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("找不到该学号的学生，删除失败！");
    }
}
