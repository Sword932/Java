package www.itheima.a02BigIntegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntergerDemo1 {
    public static void main(String[] args) {
        //1、获取指定的大整数
        BigInteger b1 = new BigInteger("123456789456123");
        System.out.println(b1);
        //2、获取随机大整数，范围：[0 ~ 2的num次方-1]
        BigInteger b2 = new BigInteger(4,new Random());
        System.out.println(b2);
    }
}
