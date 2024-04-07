package com.demo.demo1.model;

public class HummerH2Model extends HummerModel {

    @Override
    public void start() {
        System.out.println("HummerH2Model 启动");
    }

    @Override
    public void stop() {
        System.out.println("HummerH2Model 停车");
    }

    @Override
    public void alarm() {
        System.out.println("HummerH2Model 鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("HummerH2Model 引擎声");
    }
}
