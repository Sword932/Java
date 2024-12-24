package com.heima.stringdemo;

public class Test9 {
    public static void main(String[] args) {
        String idNO = "41270219990614233X";
        System.out.println("人物信息为：");
        shieldBorn(idNO);
        shieldSex(idNO);
    }
    public static void shieldBorn(String idNO){
        String born = idNO.substring(6,14);
        String year = born.substring(0,4);
        String mon = born.substring(4, 6);
        String day = born.substring(6, 8);
        System.out.println("出生年月日：" + year + "年" + mon + "月" + day + "日");
    }

    public static void shieldSex(String idNo){
        String sex = idNo.substring(16,17);
        if (sex.equals("1")  || sex.equals("3") || sex.equals("5") || sex.equals("7") || sex.equals("9")){
            System.out.println("性别：男");
        } else {
            System.out.println("性别：女");
        }
    }
}
