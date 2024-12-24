package com.itheima.test8;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];
        //1、创建女朋友对象
        GirlFriend g1 = new GirlFriend("章若楠", 23, "女", "旅行");
        GirlFriend g2 = new GirlFriend("成果", 22, "女", "打游戏");
        GirlFriend g3 = new GirlFriend("刘亦菲", 29, "女", "打网球");
        GirlFriend g4 = new GirlFriend("李沁", 27, "女", "做家务");
        //2、把女朋友对象添加到女朋友数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;
        //3、计算四个女朋友的平均年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getAge();
        }
        System.out.println("平均年龄：" + sum/arr.length);
        //4、统计低于平均年龄女朋友的个数，并打印她们的信息
        int temp = 0;
        System.out.println("=================低于平均年龄女朋友信息===================");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge() < sum/ arr.length){
                temp++;
                System.out.println("姓名：" + arr[i].getName() + "\t 年龄：" + arr[i].getAge() + "\t 性别：" + arr[i].getSex() + "\t 爱好：" + arr[i].getHobby());
            }
        }
        System.out.println("========================================================");
        System.out.printf("一共有%d个女朋友年龄低于女朋友平均年龄", temp);
    }
}
