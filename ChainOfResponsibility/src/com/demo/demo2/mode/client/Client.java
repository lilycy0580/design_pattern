package com.demo.demo2.mode.client;

import com.demo.demo2.mode.handler.Handler;
import com.demo.demo2.mode.handler.impl.ConcreteHandler1;
import com.demo.demo2.mode.handler.impl.ConcreteHandler2;
import com.demo.demo2.mode.handler.impl.ConcreteHandler3;
import com.demo.demo2.mode.handler.other.Request;
import com.demo.demo2.mode.handler.other.Response;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        Response response = handler1.handleMsg(new Request(),"3");
    }
}
