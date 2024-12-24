package com.itheima.a05interclassdemo5;

public class Test {
    public static void main(String[] args) {

        new Swim(){
            @Override
            public void swim(){
                System.out.println("重写接口的swim方法");
            }
        };

        new Animal(){
          @Override
          public void eat(){
              System.out.println("重写了eat方法");
          }
        };
    }
}
