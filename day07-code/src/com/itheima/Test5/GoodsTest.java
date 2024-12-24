package com.itheima.Test5;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        //1、创建商品对象
        Goods g1 = new Goods("001", "华为P60", 6999.0, 1000);
        Goods g2 = new Goods("002", "保温杯", 229.0, 500);
        Goods g3 = new Goods("003", "茶叶", 26.7, 350);

        //2、把商品对象加入商品数组
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        
        //3、遍历输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println("商品ID: " + arr[i].getId() + " ,商品名：" + arr[i].getName()  + " , 商品价格：" + arr[i].getPrice() + " , 商品存量：" + arr[i].getCount());
        }
    }
}
