package com.demo.demo1.client;

import com.demo.demo1.handler.Handler;
import com.demo.demo1.handler.impl.Father;
import com.demo.demo1.handler.impl.Husband;
import com.demo.demo1.handler.impl.Son;
import com.demo.demo1.woman.IWoman;
import com.demo.demo1.woman.impl.Woman;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Client {


    public static void main(String[] args) {
        Random random = new Random();
        List<IWoman> list = new Vector<>();
        for (int i = 0; i < 5; i++) {
            Woman woman = new Woman(random.nextInt(4),"逛街");
            list.add(woman);
            System.out.println(woman.toString());
        }


        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        for (IWoman woman:list){
            father.HandlerMsg(woman);
        }
    }

}
