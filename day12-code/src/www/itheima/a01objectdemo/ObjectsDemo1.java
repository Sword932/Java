package www.itheima.a01objectdemo;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        //1、创建学生类的对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);

        //2、比较两个对象的属性值是否相同
//        if (s1 != null){
//            boolean result = s1.equals(s2);
//            System.out.println(result);
//        } else {
//            System.out.println("调用者为空");
//        }
        boolean result = Objects.equals(s1, s2);
        System.out.println(result);


        // isNull
        Student s3 = new Student();
        Student s4 = null;
        System.out.println(Objects.isNull(s3));
        System.out.println(Objects.isNull(s4));
        System.out.println(Objects.nonNull(s3));
        System.out.println(Objects.nonNull(s4));
    }
}
