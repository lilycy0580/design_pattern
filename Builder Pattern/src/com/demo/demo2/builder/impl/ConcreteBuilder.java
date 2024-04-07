package com.demo.demo2.builder.impl;

import com.demo.demo2.builder.Builder;
import com.demo.demo2.product.Product;

public class ConcreteBuilder extends Builder {

    private Product product = new Product();
    @Override
    public void setPart() {
        // 产品类内部逻辑
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
