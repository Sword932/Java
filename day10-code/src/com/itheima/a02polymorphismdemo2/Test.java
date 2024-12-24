package com.itheima.a02polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        /*
        多态的弊端
         */
        Animal a = new Dog();
//        a.lookHome();//报错
        //怎么解决：强转
//        a.eat();
//        Dog d = (Dog) a;
//        d.lookHome();

        //判断
//        if(a instanceof Dog){
//            Dog d = (Dog) a;
//            d.lookHome();
//        } else if(a instanceof Cat){
//            Cat c = (Cat) a;
//            c.catchMouse();
//        }

        //新特性
        if(a instanceof Dog d){
            d.eat();
            d.lookHome();
        } else if(a instanceof Cat c){
            c.eat();
            c.catchMouse();
        }
    }
}
class Animal{
    public void eat(){
        System.out.println("动物正在吃东西");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗在吃大骨头");
    }
    public void lookHome(){
        System.out.println("狗在看家");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫在吃小鱼干");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
