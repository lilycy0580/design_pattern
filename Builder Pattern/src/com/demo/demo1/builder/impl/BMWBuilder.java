package com.demo.demo1.builder.impl;

import com.demo.demo1.builder.CarBuilder;
import com.demo.demo1.model.CarModel;
import com.demo.demo1.model.impl.BMWModel;

import java.util.List;

public class BMWBuilder extends CarBuilder {
    private BMWModel BMW = new BMWModel();
    @Override
    public void setSequence(List<String> list) {
        this.BMW.setSequence(list);
    }

    @Override
    public CarModel getCarModel() {
        return this.BMW;
    }
}
