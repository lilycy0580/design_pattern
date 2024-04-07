package com.demo.demo1.observer.impl;

import com.demo.demo1.observer.Observer;

// 具体观察者
public class LiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯观察到韩非子活动,开始向老板汇报");
        this.reportToBoss(context);
    }

    private void reportToBoss(String reportContext){
        System.out.println("李斯向老板汇报："+reportContext);
    }
}
