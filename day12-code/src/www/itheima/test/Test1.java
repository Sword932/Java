package www.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        //第一个：被拷贝的目标
        //第二个：从第几位开始拷贝
        //第三个：拷贝到哪里
        //第四个：从哪里开始拷贝
        //第五个：拷贝多少个数据
        System.arraycopy(arr1, 6, arr2,2,3);
        System.out.println(arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
