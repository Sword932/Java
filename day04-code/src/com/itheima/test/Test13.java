package com.itheima.test;

public class Test13 {
    public static void main(String[] args) {
        /*
        需求：玩游戏时候，如果网不好那么会经常短线重连。
        那么断线重连这个业务逻辑就需要重复执行。
        假设现在公司要求，短线重连业务逻辑最多只写5次。
        请用代码实现。
         */
        for (int i = 1; i <= 5; i++){
            System.out.println("3秒后自动重连(" + i + "/5)");
        }
    }
}
