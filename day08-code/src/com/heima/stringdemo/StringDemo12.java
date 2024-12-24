package com.heima.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] arr = {1, 2, 3, 4, 5, 6};
        sb.append("[" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append("," + arr[i]);
        }
        sb.append("]");
        System.out.println(sb);
    }
}
