package com.itheima.test;

public class Test19 {
    public static void main(String[] args) {
        int[][] money = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
        int moneySum = 0;
        for (int i = 0; i < money.length; i++) {
            System.out.println("第" + (i+1) + "季度的总营业额为：" + quarterSum(money[i]));
            moneySum = moneySum + quarterSum(money[i]);
        }
        System.out.println("全年的总营业额为：" + moneySum);
    }
    public static int quarterSum(int [] quarter) {
        int sum = 0;
        for (int i = 0; i < quarter.length; i++) {
            sum = sum + quarter[i];
        }
        return sum;
    }
}
