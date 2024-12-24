package com.heima.stringdemo;

import java.util.StringJoiner;

public class StringDemo13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6};
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        System.out.println(sj);
    }
}
