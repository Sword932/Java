package com.heima.stringdemo;

public class StringDemo4 {
    public static void main(String[] args) {
        String ch = "SDFASDsadasdf1254563";
        //定义计数器，用来统计大写字母，小写字母和数字的个数
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for(int i = 0; i < ch.length(); i++){
            char c = ch.charAt(i);
            System.out.println(c);
            if(c >= 'a' && c <= 'z'){
                smallCount++;
            } else if(c >= 'A' && c <= 'Z'){
                bigCount++;
            } else if(c >= '0' && c <= '9'){
                numberCount++;
            }
        }
        System.out.println("大写字母个数：" + bigCount);
        System.out.println("小写字母个数：" + smallCount);
        System.out.println("数字的个数：" + numberCount);
    }
}
