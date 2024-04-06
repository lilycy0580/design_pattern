package com.demo.demo2.mode.factory.impl;

import com.demo.demo2.mode.factory.AbstractFactory;
import com.demo.demo2.mode.product.productA.AbstractProductA;
import com.demo.demo2.mode.product.productA.impl.ProductA2;
import com.demo.demo2.mode.product.productB.AbstractProductB;
import com.demo.demo2.mode.product.productB.impl.ProductB2;

public class Factory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
