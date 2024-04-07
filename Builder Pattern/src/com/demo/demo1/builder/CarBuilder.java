package com.demo.demo1.builder;

import com.demo.demo1.model.CarModel;

import java.util.List;

public abstract class CarBuilder {
    public abstract void setSequence(List<String> list);
    public abstract CarModel getCarModel();
}
