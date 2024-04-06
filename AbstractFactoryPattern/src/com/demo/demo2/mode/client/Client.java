package com.demo.demo2.mode.client;

import com.demo.demo2.mode.factory.AbstractFactory;
import com.demo.demo2.mode.factory.impl.Factory1;
import com.demo.demo2.mode.factory.impl.Factory2;
import com.demo.demo2.mode.product.productA.AbstractProductA;
import com.demo.demo2.mode.product.productB.AbstractProductB;

public class Client {

    public static void main(String[] args) {
        AbstractFactory creator1 = new Factory1();
        AbstractFactory creator2 = new Factory2();

        AbstractProductA a1 = creator1.createProductA();
        AbstractProductA a2 = creator2.createProductA();

        AbstractProductB b1 = creator1.createProductB();
        AbstractProductB b2 = creator2.createProductB();

        a1.doSomething();
        a2.doSomething();
        b1.doSomething();
        b2.doSomething();
    }

}
