package com.pattern.demo2;

public class ConcreteStrategy1 implements Strategy{
    @Override
    public void doSomething() {
        System.out.println("策略一的实施方案");
    }
}
