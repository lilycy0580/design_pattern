package com.demo.demo2.mode.hungry_style;

// 饿汉式
public class Singleton {

    // private static final 修饰
    private static final Singleton singleton = new Singleton();

    // 构造器私有化,只运行类内部进行访问
    private Singleton(){

    }

    // static 获取类实例
    public static Singleton getSingleton(){
        return singleton;
    }

    public static void doSomething(){
        // 业务逻辑处理....
    }

}
