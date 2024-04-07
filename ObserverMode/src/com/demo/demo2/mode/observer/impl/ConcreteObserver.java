package com.demo.demo2.mode.observer.impl;

import com.demo.demo2.mode.observer.Observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserver接到信息,开始处理");
    }
}
