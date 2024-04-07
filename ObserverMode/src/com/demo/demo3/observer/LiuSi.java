package com.demo.demo3.observer;

import java.util.Observable;
import java.util.Observer;

public class LiuSi implements Observer {

    public void update(Observable observable, Object obj){
        System.out.println("刘斯：观察到韩非子活动,做出相对应的反应...");
        this.happy(obj.toString());
    }
    private void happy(String context){
        System.out.println("刘斯：因为" +context+",——所以我快乐呀！" );
    }
}