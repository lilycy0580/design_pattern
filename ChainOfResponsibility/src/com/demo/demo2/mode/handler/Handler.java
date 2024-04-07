package com.demo.demo2.mode.handler;

import com.demo.demo2.mode.handler.other.Level;
import com.demo.demo2.mode.handler.other.Request;
import com.demo.demo2.mode.handler.other.Response;

public abstract class Handler {
    private Handler nextHandler;
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public final Response handleMsg(Request request,String level){
        Response response = null;
        if(this.getHandlerLevel().equals(request.getRequestLevel(level))){
            response = this.echo(request);
        }else{
            if(this.nextHandler!=null){
                response = this.nextHandler.handleMsg(request,level);
            }else {

            }
        }
        return response;
    }

    // 每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();
    // 处理者必须实现处理任务
    protected abstract Response echo(Request request);
}
