package com.itheima.test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*
        需求：
        假设现在我们拨打了一个机票预定电话。
        电话中语音提示：
        1、机票查询
        2、机票预定
        3、机票改签
        4、退出服务
        其他按键也是退出服务。请使用switch模拟该业务逻辑。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入号码：");
        int number = sc.nextInt();
        switch (number){
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预定");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
                System.out.println("退出服务");
                break;
            default:
                System.out.println("退出服务");
                break;
        }
    }
}
