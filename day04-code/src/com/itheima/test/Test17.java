package com.itheima.test;

public class Test17 {
    public static void main(String[] args) {
        /*
        需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我
        们有一张足够大的纸，它的厚度是0.1毫米。
        请问，我折叠多少次，可以折成珠穆朗玛峰的高度？
         */
        double mountainHigh = 8844430;
        double paperHigh = 0.1;
        //定义变量记录折叠次数
        int count = 0;
        while (paperHigh < mountainHigh){
            paperHigh = paperHigh * 2;
            count++;
        }
        System.out.println("一共折叠：" + count);
    }
}
