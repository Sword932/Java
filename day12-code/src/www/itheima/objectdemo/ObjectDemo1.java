package www.itheima.objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        //1、toString 返回对象的字符串表示形式
        Object obj = new Object();
        String string = obj.toString();
        System.out.println(string);  //java.lang.Object@776ec8df

        Student s1 = new Student();
        String string1 = s1.toString();
        System.out.println(string1);  //www.itheima.objectdemo.Student@3b07d329
    }
}
