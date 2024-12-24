package com.heima.stringdemo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        String[] NumberArr = {" ","Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        char[] Number1Arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        for (int i = 0; i < number.length(); i++) {
            if(number.charAt(i) >= '0' && number.charAt(i) <= '9'){
                for (int i1 = 1; i1 < NumberArr.length; i1++) {
                    if (number.charAt(i) == Number1Arr[i1]){
                        sb.append(NumberArr[i1]);
                    }
                }
            } else {
                System.out.println("输入的不是纯数字，请重新输入！");
                break;
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
