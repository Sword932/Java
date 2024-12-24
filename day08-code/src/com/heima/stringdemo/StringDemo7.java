package com.heima.stringdemo;

public class StringDemo7 {
    public static void main(String[] args) {
        String money = "142135";
        convertString(money);
    }

    public static void convertString(String money) {
        //如果money不足8位，则补全8位
        while(money.length() < 7){
            money = "0" + money;
        }
        System.out.println(money);
        String[] unit = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        //把对应的数字转换为大写
        String big = "";
        int sum = 1;
        for (int i = money.length() - 1; i > 0; i--) {
            big = unit[i-1] + big;
            if(money.charAt(i) == '0'){
                big = "零" + big;
            }
            if(money.charAt(i) == '1'){
                big = "壹" + big;
            }
            if(money.charAt(i) == '2'){
                big = "贰" + big;
            }
            if(money.charAt(i) == '3'){
                big = "叁" + big;
            }
            if(money.charAt(i) == '4'){
                big = "肆" + big;
            }
            if(money.charAt(i) == '5'){
                big = "伍" + big;
            }
            if(money.charAt(i) == '6'){
                big = "陆" + big;
            }
            if(money.charAt(i) == '7'){
                big = "柒" + big;
            }
            if(money.charAt(i) == '8'){
                big = "捌" + big;
            }
            if(money.charAt(i) == '9'){
                big = "玖" + big;
            }
            }
        System.out.println(big);
    }
}
