package com.demo.demo1.observable.impl;

import com.demo.demo1.observable.Observable;
import com.demo.demo1.observable.hanfeizi.IHanFeiZi;
import com.demo.demo1.observer.Observer;

import java.util.List;
import java.util.Vector;

// 具体的观察者
public class HanFeiZi implements Observable, IHanFeiZi {

    private List<Observer> observableList = new Vector<>();

    @Override
    public void addObserver(Observer observer) {
        this.observableList.add(observer);

    }

    public void deleteObserver(Observer observer){
        this.observableList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer: observableList) {
            observer.update(context);
        }
    }

    @Override
    public void haveBreakfast() {
        this.notifyObservers("韩非子吃饭");
    }

    @Override
    public void haveFun() {
        this.notifyObservers("韩非子娱乐");
    }
}
