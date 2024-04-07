package com.demo.demo1.handler;

import com.demo.demo1.woman.IWoman;

public abstract class Handler {

    public final static int FATHER_LEVEL = 1;
    public final static int HUSBAND_LEVEL = 2;
    public final static int SON_LEVEL = 3;

    private int level = 0;
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void HandlerMsg(IWoman woman){
        if(woman.getType()==this.level){
            this.response(woman);
        }else {
            if(this.nextHandler!=null){
                this.nextHandler.response(woman);
            }else{
                System.out.println("无地方请示,默认不同意");
            }
        }
    }

    protected abstract void response(IWoman woman);
}
