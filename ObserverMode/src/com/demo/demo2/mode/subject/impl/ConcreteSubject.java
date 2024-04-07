package com.demo.demo2.mode.subject.impl;

import com.demo.demo2.mode.subject.Subject;

// 具体观察者
public class ConcreteSubject extends Subject {
    public void doSomething(){
        System.out.println("ConcreteSubject 的 doSomething...");
        super.notifyObserver();
    }
}
