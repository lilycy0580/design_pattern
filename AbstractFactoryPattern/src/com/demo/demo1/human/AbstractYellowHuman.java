package com.demo.demo1.human;

public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人黄色");
    }

    @Override
    public void talk() {
        System.out.println("黄种人双字节");
    }
}
