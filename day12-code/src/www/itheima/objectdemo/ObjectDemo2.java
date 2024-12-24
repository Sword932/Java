package www.itheima.objectdemo;

public class ObjectDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User u1 = new User(1, "张三", "1234qwer", "girl11", data);

        //2、克隆对象
        User u2 = (User) u1.clone();

        //object中的是浅克隆
        int[] arr = u1.getData();
        arr[0] = 100;

        System.out.println(u1);
        System.out.println(u2);

    }
}
