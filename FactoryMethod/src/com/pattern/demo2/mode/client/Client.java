package com.pattern.demo2.mode.client;

import com.pattern.demo2.mode.factory.Factory;
import com.pattern.demo2.mode.factory.impl.ConcreteFactory;
import com.pattern.demo2.mode.product.impl.ConcreteProduct1;
import com.pattern.demo2.mode.product.Product;

public class Client {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProduct1.class);
        product.method1();
        product.method2();
    }

}
