package www.itheima.a06bigintegerdemo;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        //1、创建两个BigInteger对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(20);
        System.out.println(bd1.add(bd2));//加法
        System.out.println(bd1.subtract(bd2));//减法
        System.out.println(bd1.multiply(bd2));//乘法
        System.out.println(bd1.divide(bd2));//除法
        System.out.println(bd1.divideAndRemainder(bd2)[0] + ", " + bd1.divideAndRemainder(bd2)[1]);//求商和余数
        System.out.println(bd1.equals(bd2));
        System.out.println(bd1.pow(2));
        System.out.println(bd1.max(bd2) == bd2);
    }
}
