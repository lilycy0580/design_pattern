package com.demo.demo1.human;

public abstract class AbstractBlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑种人黑色");
    }

    @Override
    public void talk() {
        System.out.println("黑种人听不懂");
    }

}
