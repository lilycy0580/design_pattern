package com.demo.demo2.mode.lazy_style;

// 懒汉式
public class Singleton {

    // private static 修饰
    private static Singleton singleton = null;

    // 构造器私有化,只能类内部调用
    private Singleton(){

    }

    // synchronized 保证线程安全
    public synchronized static Singleton getSingleton(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
