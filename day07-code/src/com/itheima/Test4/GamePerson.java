package com.itheima.Test4;

import java.util.Random;

public class GamePerson {
    private String name;
    private int life;
    public GamePerson(){

    }
    public GamePerson(String name, int life){
        this.name = name;
        this.life = life;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setLife(int life){
        this.life = life;
    }
    public int getLife(){
        return life;
    }

    public void attack(GamePerson Role){
        //造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(1, 21);

        //修改一个被攻击对象的血量
        int remainLife = Role.getLife() - hurt;
        remainLife = remainLife < 0 ? 0 : remainLife;
        Role.setLife(remainLife);
        System.out.println(this.getName() + "攻击了" +
                Role.getName() + "，并造成了" + hurt + "点伤害" +
                ", " + Role.getName() + "剩余血量"  + remainLife);
    }
}
