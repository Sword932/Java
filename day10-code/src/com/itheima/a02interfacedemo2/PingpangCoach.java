package com.itheima.a02interfacedemo2;

public class PingpangCoach extends Coach implements SpeakEnglish{
    public PingpangCoach() {
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void Teaching() {
        System.out.println("乒乓球教练在教打乒乓球");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("乒乓球教练在说英语");
    }
}
