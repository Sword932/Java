package www.itheima.test;

import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //1、当前系统的运行环境对象
//        Runtime r1 = Runtime.getRuntime();
//        Runtime r2 = Runtime.getRuntime();
//        System.out.println(r1 == r2);   //true

        //2、exit   停止虚拟机
//        Runtime.getRuntime().exit(0);
//        System.out.println("看看我执行了吗？");  //不执行

        //3、获取CPU线程数
//        int r = Runtime.getRuntime().availableProcessors();
//        System.out.println(r);   //16

        //4、总内存大小,单位byte 字节
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);  //4028 MB

        //5、已经获取的总内存大小，单位byte 字节
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);  //252 MB

        //6、剩余内存的大小，单位byte 字节
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);   //249 MB

        //7、运行cmd命令
        Runtime.getRuntime().exec("shutdown -a");
    }
}
