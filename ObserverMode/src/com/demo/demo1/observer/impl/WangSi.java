package com.demo.demo1.observer.impl;

import com.demo.demo1.observer.Observer;

public class WangSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("王斯观察到韩非子活动：");
        this.cry(context);
    }

    private void cry(String context){
        System.out.println("王斯："+context);
    }
}
