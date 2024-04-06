package com.demo.demo1.human;

public abstract class AbstractWhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白种人白色");
    }

    @Override
    public void talk() {
        System.out.println("白种人单字节");
    }


}
