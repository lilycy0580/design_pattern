package com.demo.demo3.observer;

import java.util.Observable;
import java.util.Observer;

public class WangSi implements Observer {

    public void update(Observable observable, Object obj){
        System.out.println("王斯：观察到韩非子活动,做出反应...");
        this.cry(obj.toString());
    }
    private void cry(String context){
        System.out.println("王斯：因为"+context+"，——所以我悲伤呀！");
    }
}