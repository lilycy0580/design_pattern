package com.pattern.demo1;

public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate(){
        this.strategy.operate();
    }
}
