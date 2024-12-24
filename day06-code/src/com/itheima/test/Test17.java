package com.itheima.test;

import java.util.Random;

public class Test17 {
    /*
    需求：
    一个大V直播抽奖，奖品是现金红包，分别有{2, 588, 888, 1000, 10000}五个奖项。要求奖项随机，但是不重复
     */
    public static void main(String[] args) {
        //定义一个奖池数组
        int[] award = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        //随机抽取一个奖项
        int index = r.nextInt(0, award.length);
        System.out.println(award[index] + "元的奖金已被抽走！");
        //抽取奖项之后将该奖项设置为0
        award[index] = 0;
        //继续抽取没有抽取过的奖项
        for (int i = 0; i < award.length - 1; i++) {
            //如果抽到已经抽过的奖项，则继续随机抽取，直到抽到没有抽取过的
            while (award[index] == 0) {
                index = r.nextInt(0, award.length);
            }
            System.out.println(award[index] + "元的奖金已被抽走！");
            award[index] = 0;
        }
    }
}
