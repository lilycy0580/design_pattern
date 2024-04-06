package com.pattern.demo1.human.impl;

import com.pattern.demo1.human.Human;

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
