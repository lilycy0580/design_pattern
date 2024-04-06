package com.pattern.demo3.human.impl;

import com.pattern.demo3.human.Human;
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人皮肤是黄色");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说话,一般双字节");
    }
}
