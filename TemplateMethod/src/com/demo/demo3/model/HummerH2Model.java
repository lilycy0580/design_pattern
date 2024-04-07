package com.demo.demo3.model;

public class HummerH2Model extends HummerModel {
    protected boolean isAlarm(){
        return  false ;
    }
    @Override
    protected void start() {
        System.out.println("HummerH2Model 启动");
    }
    @Override
    protected void stop() {
        System.out.println("HummerH2Model 停车");
    }
    @Override
    protected void alarm() {
        System.out.println("HummerH2Model 鸣笛");
    }
    @Override
    protected void engineBoom() {
        System.out.println("HummerH2Model 引擎声");
    }
}

