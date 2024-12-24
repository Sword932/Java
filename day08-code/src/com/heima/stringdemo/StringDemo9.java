package com.heima.stringdemo;

public class StringDemo9 {
    public static void main(String[] args) {
        //1、获取到说的话
        String talk = "你玩的真好，以后不要玩了，SB,CNM";

        //定义一个敏感词库
        String[] arr = {"TMD", "CNM", "SB", "MLGB"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 3){
                talk = talk.replace(arr[i], "***" );
            } else if(arr[i].length() == 4){
                talk = talk.replace(arr[i], "****" );
            } else if(arr[i].length() == 2){
                talk = talk.replace(arr[i], "**");
            }
        }
        System.out.println(talk);
    }
}
