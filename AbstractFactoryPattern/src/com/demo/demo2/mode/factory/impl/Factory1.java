package com.demo.demo2.mode.factory.impl;

import com.demo.demo2.mode.factory.AbstractFactory;
import com.demo.demo2.mode.product.productA.AbstractProductA;
import com.demo.demo2.mode.product.productA.impl.ProductA1;
import com.demo.demo2.mode.product.productB.AbstractProductB;
import com.demo.demo2.mode.product.productB.impl.ProductB1;

public class Factory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
