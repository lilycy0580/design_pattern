package com.demo.demo2.director;

import com.demo.demo2.builder.Builder;
import com.demo.demo2.builder.impl.ConcreteBuilder;
import com.demo.demo2.product.Product;


// 封装类
public class Director {

    private Builder builder = new ConcreteBuilder();

    public Product getAProduct(){
        builder.setPart();
        return builder.buildProduct();
    }

}
