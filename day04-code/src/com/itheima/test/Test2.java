package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        /*
        需求：自动驾驶
        如果是红灯停，绿灯行走
         */
        //1、定义灯的状态
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;
        //2、判断哪个灯亮
        if(isLightGreen){
            System.out.println("gogogo！");
        }
        if(isLightYellow){
            System.out.println("slow!");
        }
        if(isLightRed){
            System.out.println("stop!");
        }
    }
}
