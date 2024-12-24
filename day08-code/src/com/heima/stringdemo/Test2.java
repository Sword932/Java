package com.heima.stringdemo;

public class Test2 {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "ceabd";
        boolean result = rotate(A, B);
        if(result){
            System.out.println("能够匹配！");
        } else {
            System.out.println("不能匹配！");
        }
    }

    //作用：旋转字符串
    public static boolean rotate(String A, String B) {
        int sum = 0;
        for (int i = 0; i < A.length(); i++) {
            String oneIndex = A.substring(0,1);
            String afterIndex = A.substring(1,A.length());
            A = afterIndex + oneIndex;
            sum++;
            System.out.println("第"+ sum + "次：" + A);
            if (B.equals(A)){
                return true;
            }
        }
        return false;
    }
}
