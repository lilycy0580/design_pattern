package com.demo.demo3.observer;

import java.util.Observable;
import java.util.Observer;

// 观察者
public class LiSi implements Observer {

    public void update(Observable observable, Object obj){
        System.out.println("李斯：观察到李斯活动,做出反应...");
        this.reportToQiShiHuang(obj.toString());
    }
    private void reportToQiShiHuang(String reportContext){
        System.out.println("李斯：报告老板,韩非子活动--->"+reportContext);
    }
}