package com.demo.demo3.model;

public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    // 钩子方法
    protected boolean isAlarm(){
        return  true;
    }
    final public void run(){
        this.start();
        this.engineBoom();
        // 调用钩子方法,进行判断
        if(this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }
}

