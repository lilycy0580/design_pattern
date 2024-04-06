package com.pattern.demo1.human.impl;

import com.pattern.demo1.human.Human;

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑种人皮肤是黑色");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话一般听不懂");
    }
}
