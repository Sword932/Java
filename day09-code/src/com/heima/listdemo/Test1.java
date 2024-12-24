package com.heima.listdemo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
        while (true){
            User u = new User();
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("请选择操作1登录 2注册 3忘记密码");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    logIn(list);
                    break;
                case 2:
                    register(list, u);
                    break;
                case 3:
                    forgotPassword(list);
                    break;
                default:
                    System.out.println("没有此操作！");
                    break;
            }
        }
    }

    //登录功能
    public static void logIn(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("登录");
        lenp: while (true){
            String yzmTrue = yzm();
            System.out.println("请输入用户名");
            String userName = sc.next();
            if (list.size() == 0){
                System.out.println("用户名未注册，请先注册");
                break;
            }
            for (int i = 0; i < list.size(); i++) {
                if (userName.equals(list.get(i).getUserName())){
                    System.out.println("请输入密码");
                    String passWord = sc.next();
                    System.out.println("请输入验证码");
                    System.out.println(yzmTrue);
                    String yzm = sc.next();
                    if(yzm.equals(yzmTrue)){
                        for (int i1 = 0; i1 < list.size(); i1++) {
                            if (passWord.equals(list.get(i).getPassWord())){
                                System.out.println("登录成功！");
                                Test ss = new Test();
                                ss.startStudentSystem();
                                break lenp;
                            } else {
                                System.out.println("密码错误，请重新输入");
                                break;
                            }
                        }
                    } else {
                        System.out.println("验证码错误，请重新输入");
                    }
                } else {
                    System.out.println("用户名未注册，请先注册");
                    break lenp;
                }
            }
        }
    }

    //注册方法
    public static void register(ArrayList<User> list, User u) {
        Scanner sc = new Scanner(System.in);

        //用户名
        while (true){
            System.out.println("请输入用户名");
            String newUserName = sc.next();
            boolean flag = contain(list,newUserName);
            if(flag){//如果唯一，则提示，并重新输入
                System.out.println("用户名存在，请重新输入");
            } else {
                boolean lengthFlag = userLength(newUserName);
                if (lengthFlag){
                    boolean pureDigital = pureDigital(newUserName);
                    if (pureDigital){
                        u.setUserName(newUserName);
                        break;
                    } else {
                        System.out.println("用户名必须是字母加数组的组合，请重新输入");
                    }
                } else {
                    System.out.println("用户名长度不在3-15位之间，请重新输入");
                }
            }
        }
        //密码
        while (true){
            System.out.println("请输入密码");
            String newPassWord1 = sc.next();
            System.out.println("请再次输入密码");
            String newPassWord2 = sc.next();
            if (newPassWord1.equals(newPassWord2)){
                u.setPassWord(newPassWord1);
                break;
            } else {
                System.out.println("两次密码不一致，请重新输入");
            }
        }
        //身份证
        while (true){
            System.out.println("请输入身份证号码");
            String newIdNumber = sc.next();
            boolean idFlag = numberLength(newIdNumber, 18);
            if (idFlag){
                //继续判断
                boolean idFirst = idFirst(newIdNumber);
                if(idFirst){
                    boolean idNum = idNum(newIdNumber, 17);
                    if(idNum){
                        u.setIdNumber(newIdNumber);
                        break;
                    } else {
                        System.out.println("前17位，必须都是数字，请重新输入");
                    }
                } else {
                    System.out.println("身份证开头为0，不合法，请重新输入");
                }
            } else {
                System.out.println("身份证长度不为18位，请重新输入");
            }
        }

        //输入手机号
        while (true){
            System.out.println("请输入手机号码");
            String newPhoneNumber = sc.next();
            boolean lengthFlag = numberLength(newPhoneNumber, 11);
            if(lengthFlag){
                //长度合法
                boolean phoneFirst = idFirst(newPhoneNumber);
                if (phoneFirst){
                    boolean phoneNum = idNum(newPhoneNumber, 11);
                    if (phoneNum){
                        u.setPhoneNumber(newPhoneNumber);
                        break;
                    } else {
                        System.out.println("手机号必须全为数字，请重新输入");
                    }
                } else {
                    System.out.println("手机号首位不能为0，请重新输入");
                }
            } else {
                System.out.println("手机号长度必须是11位，请重新输入");
            }
        }
        list.add(u);
        System.out.println("注册成功！");
    }

    public static void forgotPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if(userName.equals(list.get(i).getUserName())){
                System.out.println("请输入身份证号");
                String idNumber = sc.next();
                System.out.println("请输入手机号码");
                String phoneNumber = sc.next();
                if(idNumber.equals(list.get(i).getIdNumber()) && phoneNumber.equals(list.get(i).getPhoneNumber())){
                    System.out.println("输入密码，进行修改");
                    String passWord = sc.next();
                    list.get(i).setPassWord(passWord);
                } else {
                    System.out.println("账号信息不匹配，修改失败");
                }
            } else {
                System.out.println("未注册");
                return;
            }
        }
    }

    public static boolean contain(ArrayList<User> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            if(userName.equals(list.get(i).getUserName())){
                //存在相同的用户名，则返回true
                return true;
            }
        }
        //不存在相同的用户名，则返回false
        return false;
    }

    public static boolean userLength(String userName) {
        if(userName.length() >= 3 && userName.length() <= 15){
            return true;   //在3~15之间，返回true
        } else {
            return false;  //不在3~15之间，返回false
        }
    }
    //判断身份证的长度是否合法
    public static boolean numberLength(String idNumber, int length) {
        if(idNumber.length() == length){
            return true;
        } else {
            return false;
        }
    }
    //判断身份证的开头是否为0
    public static boolean idFirst(String idNumber) {
        if (idNumber.charAt(0) == '0'){
            return false;
        }
        return true;
    }
    public static boolean idNum(String idNumber, int length) {
        for (int i = 0; i < length; i++) {
            if (idNumber.charAt(i) < '0' || idNumber.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }

    //定义方法随机生成验证码
    public static String yzm() {
        String yzm = "abcdefghijklmnopqstuvwxyzABCDEFGHIGKLMNOPQSTUVWXYZ";
        char temp = ' ';
        char[] newYzm = new char[5];
        Random r = new Random();
        for (int i = 0; i < 4; i++){
            int number = r.nextInt(0, yzm.length());
            newYzm[i] = yzm.charAt(number);
        }
        String number = "0123456789";
        int numberIndex = r.nextInt(0,10);
        newYzm[4] = number.charAt(numberIndex);
        for (int i = 0; i < newYzm.length; i++) {
            int index = r.nextInt(0,5);
            temp = newYzm[i];
            newYzm[i] = newYzm[index];
            newYzm[index] = temp;
        }
        String strNewYzm = "";
        for (int i = 0; i < newYzm.length; i++) {
            strNewYzm = strNewYzm + newYzm[i];
        }
        return strNewYzm;
    }

    public static boolean pureDigital(String userName) {
        if(userName.charAt(0) >= '0' && userName.charAt(0) <= '9'){
            for (int i = 0; i < userName.length(); i++) {
                if (userName.charAt(i) >= 'a' && userName.charAt(i) <= 'z' || userName.charAt(i) >= 'A' && userName.charAt(i) <= 'Z'){
                    return true;
                }
            }
        }
        if(userName.charAt(0) >= 'a' && userName.charAt(0) <= 'z' || userName.charAt(0) >= 'A' && userName.charAt(0) <= 'Z'){
            for (int i = 0; i < userName.length(); i++) {
                if (userName.charAt(i) >= '0' && userName.charAt(i) <= '9'){
                    return true;
                }
            }
        }
        return false;
    }
}
