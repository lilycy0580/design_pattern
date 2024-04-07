package com.demo.demo1.observable;


import com.demo.demo1.observer.Observer;

public interface Observable {

    public void  addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers(String context);

}
