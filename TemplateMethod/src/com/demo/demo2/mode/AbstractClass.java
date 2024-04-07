package com.demo.demo2.mode;

public abstract class AbstractClass {

    // 基本方法 protected
    protected abstract void doSomething();
    protected abstract void doAnything();

    // 模板方法
    public void templateMethod(){
        // 模板方法调用基本方法,完成业务逻辑
        this.doSomething();
        this.doAnything();
    }
}
