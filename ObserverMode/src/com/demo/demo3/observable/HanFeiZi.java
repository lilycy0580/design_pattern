package com.demo.demo3.observable;

import java.util.Observable;

// 被观察者
public class HanFeiZi extends Observable {
    public void haveBreakfast(){
        System.out.println("韩非子:吃饭...");
        //通知所有的观察者
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }
    public void haveFun(){
        System.out.println("韩非子:娱乐...");
        super.setChanged();
        this.notifyObservers("韩非子在娱乐");
    }
}