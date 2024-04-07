package com.demo.demo2.mode;

public class ConcreteClass1 extends AbstractClass{
    @Override
    protected void doSomething() {
        System.out.println("ConcreteClass1 的 doSomething() ");
    }

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClass1 的 doAnything() ");

    }
}
