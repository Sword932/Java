package com.heima.listdemo;

public class User {
    private String userName;
    private String passWord;
    private String idNumber;
    private String phoneNumber;

    public User() {
    }

    public User(String userName, String passWord, String idNumber, String phoneNumber) {
        this.userName = userName;
        this.passWord = passWord;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
