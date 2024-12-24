package com.heima.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1、使用直接赋值的方法获取一个字符串对象
        String s1 = "abc";
        System.out.println(s1);

        //2、使用new的方法获取一个字符串对象
        //空参构造:可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        //3、传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        //4、传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        //需求：修改字符串中的内容
        //abcd---->  {'a', 'b', 'c', 'd'}  ---> {'Q', 'b', 'c', 'd'}  --> "Qbcd"
        char[] chs = {'Q', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);
        //5、传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        //应用场景：以后在网络当中传输的数据其实都是字节信息
        //我们要把字节信息转换成字符串，就要用到这个构造
        byte[] b = {97, 98, 99, 100};
        String s5 = new String(b); //查到ACSSI码再输出
        System.out.println(s5);
    }
}
