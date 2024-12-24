package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        String[] pathArr = new String[31];
        //动物拼图
        for (int i = 0; i < 8; i++) {
            String path = "..\\day11-code\\image\\animal\\animal" + (i + 1) + "\\";
            pathArr[i] = path;
        }
        //美女拼图
        for (int i = 0; i < 13; i++) {
            String path = "..\\day11-code\\image\\girl\\girl" + (i + 1) + "\\";
            pathArr[i + 8] = path;
        }
        //运动拼图
        for (int i = 0; i < 10; i++) {
            String path = "..\\day11-code\\image\\sport\\sport" + (i + 1) + "\\";
            pathArr[i + 8 + 13] = path;
        }
    }
}
