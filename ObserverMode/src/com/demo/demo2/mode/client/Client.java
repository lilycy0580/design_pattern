package com.demo.demo2.mode.client;

import com.demo.demo2.mode.observer.Observer;
import com.demo.demo2.mode.observer.impl.ConcreteObserver;
import com.demo.demo2.mode.subject.impl.ConcreteSubject;

public class Client {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        concreteSubject.addObserver(observer);
        concreteSubject.doSomething();
    }
}
