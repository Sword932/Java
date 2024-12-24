package com.itheima.methoddemo;

public class MethodDemo1 {
    public static void main(String[] args) {
        //直接调用
        add(5,9);

        //赋值调用
        int addSum = add(5, 9);
        System.out.println(addSum);

        //输出调用
        System.out.println(add(5, 9));

    }
    public static int add(int a, int b){
        int c = a + b;
        return c;
    }
}
