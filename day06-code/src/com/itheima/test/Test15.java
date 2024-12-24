package com.itheima.test;

import java.util.Scanner;

public class Test15 {
    /*
    需求：
    某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
    规则如下：
           先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要传输的数字：");
        int number = sc.nextInt();
        //1、先得到每位数和反转
        int[] num = getNum(number);
        //2、将每位数都加上5，再对10求余,得到答案
        int result = getPass(num);
        //3、输出加密后的结果
        System.out.println("加密后用于传输的结果为：" + result);

    }

    //拿到每位数的反转
    public static int[] getNum(int number) {
        int i = 1;
        //定义临时变量用于统计数组需要的长度
        int number1 = number;
        while(number1 > 9){
            number1 = number1 / 10;
            i++;
        }

        int[] num = new int[i];
        for (int j = 0; j < i; j++){
            num[j] = number % 10;
            number = number / 10;
        }
        return num;
    }

    public static int getPass(int[] num) {
        int number = 0;
        for (int i = 0; i < num.length; i++) {
            //进行加5，再对10求余加密
            int demp = ( num[i] + 5 ) % 10;
            //将每个数字按位数乘10
            for (int j = num.length - 1 - i; j > 0; j--){
                demp = demp * 10;
            }
            //将每个位加起来得到结果
            number = number + demp;
        }
        return number;
    }
}
