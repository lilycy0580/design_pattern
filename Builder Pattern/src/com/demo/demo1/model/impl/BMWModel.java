package com.demo.demo1.model.impl;

import com.demo.demo1.model.CarModel;

public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("BMW start");
    }

    @Override
    protected void alarm() {
        System.out.println("BMW alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("BMW engineBoom");
    }

    @Override
    protected void stop() {
        System.out.println("BMW stop");
    }
}
