package com.demo.demo2.mode.subject;

import com.demo.demo2.mode.observer.Observer;

import java.util.Vector;

public abstract class Subject {
    private Vector<Observer> obsVector = new Vector<>();

    public void addObserver(Observer o){
        this.obsVector.add(o);
    }

    public void delObserver(Observer o){
        this.obsVector.remove(o);
    }

    // 通知所有观察者
    public void notifyObserver(){
        for (Observer observer : this.obsVector) {
            observer.update();
        }
    }

}
