package com.pattern.demo2.mode.factory;

import com.pattern.demo2.mode.product.Product;

public abstract class Factory {

    public abstract <T extends Product> T createProduct(Class<T> c);

}
