package com.heima.stringdemo;

public class StringDemo5 {
    /*
    定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
    调用该方法，并在控制台输出结果。
    例如：
            数组为 int[] arr = {1,2,3};
            执行方法后的输出结果为： [1,2,3]
     */
    public static void main(String[] args) {
        int[] arr = {1,4,4,5,6};
        montageString(arr);
    }

    public static void montageString(int[] arr) {
        if (arr.length == 0){
            System.out.println("[]");
        } else {
            System.out.print("[" );
            System.out.print(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                System.out.print("," + arr[i]);
            }
            System.out.println("]");
        }
    }
}
