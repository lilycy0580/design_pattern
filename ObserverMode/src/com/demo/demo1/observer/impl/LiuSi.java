package com.demo.demo1.observer.impl;

import com.demo.demo1.observer.Observer;

public class LiuSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("刘斯观察到韩非子活动：");
        this.happy(context);
    }

    private void happy(String context){
        System.out.println("刘斯："+context);
    }
}
