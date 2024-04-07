package com.demo.demo1.builder.impl;

import com.demo.demo1.builder.CarBuilder;
import com.demo.demo1.model.CarModel;
import com.demo.demo1.model.impl.BenzModel;

import java.util.List;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(List<String> list) {
        this.benz.setSequence(list);
    }
    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
