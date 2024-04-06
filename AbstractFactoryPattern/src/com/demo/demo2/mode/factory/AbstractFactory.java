package com.demo.demo2.mode.factory;

import com.demo.demo2.mode.product.productA.AbstractProductA;
import com.demo.demo2.mode.product.productB.AbstractProductB;

public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();

}
