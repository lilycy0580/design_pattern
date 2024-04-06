package com.pattern.demo3.human.impl;
import com.pattern.demo3.human.Human;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白种人肤色一般是白色");
    }

    @Override
    public void talk() {
        System.out.println("白种人会说话,一般是单字节");
    }
}
