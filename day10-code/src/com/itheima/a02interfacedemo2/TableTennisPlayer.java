package com.itheima.a02interfacedemo2;

public class TableTennisPlayer extends Athlete implements SpeakEnglish {
    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void Study() {
        System.out.println("乒乓球运动员学打乒乓球");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}
