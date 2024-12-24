package com.heima.stringdemo;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        String str = "abcdefg";
        Random r = new Random();
        int index = r.nextInt(0, str.length());
        char[] arr = str.toCharArray();
        char temp = ' ';
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
