package com.demo.demo2.builder;

import com.demo.demo2.product.Product;

public  abstract class Builder {

    public abstract void setPart();

    public abstract Product buildProduct();

}
