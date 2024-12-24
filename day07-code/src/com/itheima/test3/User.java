package com.itheima.test3;

public class User {
    private String userName;
    private String userPassWord;
    private String UserPassWord1;
    private String email;
    private String sex;
    private int age;
    public User(){

    }
    public User(String userName, String userPassWord, String userPassWord1,
    String email, String sex, int age){
        if(userPassWord == userPassWord1){
            this.userName = userName;
            this.userPassWord = userPassWord;
            this.email = email;
            this.sex = sex;
            this.age = age;
        } else {
            System.out.println("两次密码输入不一样，请重新输入密码！");
        }
    }

    //快捷键：
    //alt + insert

    //alt + Fn + insert
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }

    public void setUserPassWord(String userPassWord){
        this.userPassWord = userPassWord;
    }
    public String getUserPassWord(){
        return userPassWord;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }

    public void setAge(int age){
        if(age >= 0 && age <= 120){
            this.age = age;
        } else {
            System.out.println("年龄输入有误");
        }
    }
    public int getAge(){
        return age;
    }
}
