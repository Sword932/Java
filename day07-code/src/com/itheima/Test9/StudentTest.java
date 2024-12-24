package com.itheima.Test9;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student s1 = new Student("001", "张三", 15);
        Student s2 = new Student("002", "李四", 13);
        arr[0] = s1;
        arr[1] = s2;
        Student s3 = new Student("003", "王五", 18);
        //判断学生对象数组中的id中是否存在要添加的学生对象的id
        boolean flag = only(arr, s3);
        if(flag){
            //在数组中，不添加
        } else {
            //不在数组中，要添加
            //两种情况：1、数组满，需要创建新数组添加。2、数组未满，直接添加。
            int count = getCount(arr);
            if (count == arr.length){
                //数组满，创建新数组，并copy原数组中的对象进新数组
                Student[] newArr = createNewArr(arr);
                newArr[count] = s3;
                //遍历数组，打印输出
                printArr(newArr);
            } else {
                //数组未满，直接添加
                arr[count] = s3;
                //遍历数组，打印输出
                printArr(arr);
            }
        }
        //根据id删除学生信息
        System.out.println("===========删除后学生信息============");
        int index = getIndex(arr,"001");
        if(index >= 0){
            //如果存在，则删除
            arr = delect(arr, index);
            printArr(arr);
        } else {
            System.out.println("找不到为该学号的学生！");
        }

        System.out.println("===========查找后学生信息============");
        int index1 = getIndex(arr,"003");
        if(index1 >= 0){
            //如果存在，则年龄+1
            selectID(arr, index1);
            printArr(arr);
        } else {
            System.out.println("找不到为该学号的学生！");
        }
    }
    //查找数组中的id，如果存在则将他的年龄+1岁

    public static void selectID(Student[] arr, int index) {
        arr[index].setAge(arr[index].getAge() + 1);

    }
    public static int getIndex(Student[] arr, String id) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (id == arr[i].getId()) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
    public static Student[] delect(Student[] arr, int index){
            //如果是数组中最后一个数据，则直接删除
            if (index == arr.length - 1) {
                arr[index] = null;
            } else {
                //如果不是最后一个数据，则把当前数组的下标，指向下一个数组中对象的地址，最后一个对象指向null
                for (int i1 = index; i1 < arr.length; i1++) {
                    if (i1 == arr.length - 1) {
                        arr[i1] = null;
                    } else {
                        arr[i1] = arr[i1 + 1];
                    }
                }
            }
            return arr;
        }
    //遍历数组，打印输出
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                System.out.println("学号："+ arr[i].getId() +"\t姓名：" + arr[i].getName() + "\t年龄：" + arr[i].getAge());
            }
        }
    }
    //如数组满，创建新数组，并把原数组中的对象copy到新数组
    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    //统计数组中已经存了多少个对象
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }
    //判断学生对象数组中的id中是否存在要添加的学生对象的id
    public static boolean only(Student[] arr, Student s) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                if (arr[i].getId() == s.getId()){
                    return true;
                }
            }
        }
        return false;
    }
}
