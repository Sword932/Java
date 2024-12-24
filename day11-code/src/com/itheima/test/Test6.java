package com.itheima.test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        Random r = new Random();
        char[] yzm = new char[62];
        char[] endYzm = new char[5];
        for (int i = 0; i < 26; i++){
            yzm[i] = (char)( i + 65);
        }
        for (int i = 0; i < 26; i++){
            yzm[i + 26] = (char)( i + 97);
        }
        for (int i = 0; i < 10; i++){
            yzm[i + 26 + 26] = (char)( i + 48);
        }
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(0, 52);
            endYzm[i] = yzm[index];
        }
        endYzm[4] = yzm[r.nextInt(52, 62)];
        char temp;
        for (int i = 0; i < endYzm.length; i++) {
            int index = r.nextInt(0,5);
            temp = endYzm[i];
            endYzm[i] = endYzm[index];
            endYzm[index] = temp;
        }
        String endyzm = "";
        for (int i = 0; i < endYzm.length; i++) {
            endyzm = endyzm + endYzm[i];
        }
        System.out.println(endyzm);
    }
}
