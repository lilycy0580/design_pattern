package com.pattern.demo1;

public class BlockEnemy implements IStrategy{
    @Override
    public void operate() {
        System.out.println("断后,挡追兵");
    }
}
