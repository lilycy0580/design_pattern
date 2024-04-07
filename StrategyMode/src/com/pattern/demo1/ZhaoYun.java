package com.pattern.demo1;

public class ZhaoYun {


    public static void main(String[] args) {
        Context context;
        // 策略一：
        BackDoor backDoor = new BackDoor();
        context = new Context(backDoor);
        context.operate();

        // 策略二：
        GivenGreenLight givenGreenLight = new GivenGreenLight();
        context = new Context(givenGreenLight);
        context.operate();

        // 策略三：
        BlockEnemy blockEnemy = new BlockEnemy();
        context = new Context(blockEnemy);
        context.operate();
    }

}
