package com.itheima.a02staticdemo2;

import java.util.ArrayList;

public class ArrayUtil {
    private ArrayUtil(){}

    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if ( i == arr.length - 1){
                sb.append( arr[i] );
            } else {
                sb.append( arr[i] + ", " );
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAerage(int[] arr){
        double score = 0;
        for (int i = 0; i < arr.length; i++) {
            score = score + arr[i];
        }
        score = score / arr.length;
        return score;
    }
    public static Student getMaxAge(ArrayList<Student> list){
        Student maxAgeStudent = new Student("",list.get(0).getAge(),"");
        for (int i = 0; i < list.size(); i++) {
            if (maxAgeStudent.getAge() < list.get(i).getAge()) {
                maxAgeStudent.setName(list.get(i).getName());
                maxAgeStudent.setAge(list.get(i).getAge());
                maxAgeStudent.setGender(list.get(i).getGender());
            }
        }
        return maxAgeStudent;
    }
}
