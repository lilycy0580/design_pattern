package com.demo.demo1.model.impl;

import com.demo.demo1.model.CarModel;

public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("Benz start");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Benz engineBoom");
    }

    @Override
    protected void stop() {
        System.out.println("Benz stop");
    }
}
