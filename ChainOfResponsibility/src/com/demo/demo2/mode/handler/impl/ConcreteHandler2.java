package com.demo.demo2.mode.handler.impl;


import com.demo.demo2.mode.handler.Handler;
import com.demo.demo2.mode.handler.other.Level;
import com.demo.demo2.mode.handler.other.Request;
import com.demo.demo2.mode.handler.other.Response;

public class ConcreteHandler2 extends Handler {
    protected Level getHandlerLevel(){
        return new Level("2");
    }

    // 处理者必须实现处理任务
    protected Response echo(Request request){
        System.out.println("ConcreteHandler2处理任务");
        return null;
    }
}
