package com.itheima.Test4;

public class GamePersonTest {
    public static void main(String[] args) {
        GamePerson p1 = new GamePerson("典韦" , 100);
        GamePerson p2 = new GamePerson("凯", 100);
        while(p1.getLife() != 0 && p2.getLife() != 0){
            if(p1.getLife() != 0){
                p1.attack(p2);
            } else {
                break;
            }
            if(p2.getLife() != 0){
                p2.attack(p1);
            } else {
                break;
            }
        }
        if(p2.getLife() == 0){
            System.out.println(p1.getName() + " KO. " + p2.getName());
        }
        if(p1.getLife() == 0){
            System.out.println(p2.getName() + " KO. " + p1.getName());
        }
    }
}
