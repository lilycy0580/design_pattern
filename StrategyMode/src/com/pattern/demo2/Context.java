package com.pattern.demo2;

public class Context {
    public Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void doSomething(){
        this.strategy.doSomething();
    }
}
