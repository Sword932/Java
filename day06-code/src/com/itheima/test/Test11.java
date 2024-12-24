package com.itheima.test;

public class Test11 {
    public static void main(String[] args) {
        double price = boolMon(2000.0, 12, "头等舱");
        System.out.println("价格：" + price);
    }

    public static double boolMon(double price,int mon, String type) {
        if(mon >= 5 && mon <= 10){
            if(type == "头等舱"){
                price = price * 0.9;
            } else if(type == "经济舱") {
                price = price * 0.85;
            } else {
                System.out.println("机票类型输入错误！");
            }
        } else if((mon >= 1 && mon < 5) || (mon >=11 && mon <= 12)) {
            if(type == "头等舱"){
                price = price * 0.7;
            } else if(type == "经济舱") {
                price = price * 0.65;
            } else {
                System.out.println("机票类型输入错误！");
            }
        }
        return price;
    }
}
