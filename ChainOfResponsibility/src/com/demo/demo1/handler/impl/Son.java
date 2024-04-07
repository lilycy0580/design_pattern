package com.demo.demo1.handler.impl;

import com.demo.demo1.handler.Handler;
import com.demo.demo1.woman.IWoman;

public class Son extends Handler {


    public Son() {
        super(Handler.SON_LEVEL);
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println(woman.getRequest());
    }
}
