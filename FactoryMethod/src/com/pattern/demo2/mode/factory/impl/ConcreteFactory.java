package com.pattern.demo2.mode.factory.impl;

import com.pattern.demo2.mode.factory.Factory;
import com.pattern.demo2.mode.product.Product;

public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("异常处理逻辑");
        }
        return (T)product;
    }
}
