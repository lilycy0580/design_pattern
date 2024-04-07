package com.demo.demo3.model;

public class HummerH1Model extends HummerModel {
    // 默认 响喇叭
    private boolean alarmFlag = true;
    // public 修饰符
    public void setAlarm(boolean flag) {
        this.alarmFlag = flag;
    }
    // 钩子方法
    protected boolean isAlarm(){
        return  this.alarmFlag ;
    }
    @Override
    protected void start() {
        System.out.println("HummerH1Model 启动");
    }
    @Override
    protected void stop() {
        System.out.println("HummerH1Model 停车");
    }
    @Override
    protected void alarm() {
        System.out.println("HummerH1Model 鸣笛");
    }
    @Override
    protected void engineBoom() {
        System.out.println("HummerH1Model 引擎声");
    }
}
