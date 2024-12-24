package com.itheima.a02interfacedemo2;

public class Test {
    public static void main(String[] args) {
        PingpangCoach pc = new PingpangCoach("张平", 45);
        System.out.println(pc.getName());
        System.out.println(pc.getAge());
        pc.SpeakEnglish();
        pc.Teaching();

        System.out.println("===================");

        TableTennisPlayer tp = new TableTennisPlayer("小胖", 25);
        System.out.println(tp.getName());
        System.out.println(tp.getAge());
        tp.SpeakEnglish();
        tp.Study();

        System.out.println("===================");

        BasketballCoach bc = new BasketballCoach("姚宁", 48);
        System.out.println(bc.getName());
        System.out.println(bc.getAge());
        bc.Teaching();

        System.out.println("===================");

        BasketballPlayers bp = new BasketballPlayers("阿伟", 26);
        System.out.println(bp.getName());
        System.out.println(bp.getAge());
        bp.Study();
    }
}
