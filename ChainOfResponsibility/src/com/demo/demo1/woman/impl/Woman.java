package com.demo.demo1.woman.impl;

import com.demo.demo1.woman.IWoman;

public class Woman implements IWoman {

    private int type = 0;

    private String request = "";

    public Woman(int type, String request) {
        this.type = type;
        switch (this.type){
            case 1:
                this.request= "女儿：" +request;
                break;
            case 2:
                this.request = "妻子：" +request;
                break;
            case 3:
                this.request = "母亲：" +request;
                break;
            default:
                this.request = "";
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "type=" + type +
                ", request='" + request + '\'' +
                '}';
    }
}
