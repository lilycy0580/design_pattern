package com.demo.demo1.model;

public class HummerH1Model extends HummerModel {

    @Override
    public void start() {
        System.out.println("HummerH1Model 启动");
    }

    @Override
    public void stop() {
        System.out.println("HummerH1Model 停车");
    }

    @Override
    public void alarm() {
        System.out.println("HummerH1Model 鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("HummerH1Model 引擎声");
    }
}
