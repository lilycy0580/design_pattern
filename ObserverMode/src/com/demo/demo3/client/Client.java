package com.demo.demo3.client;

import com.demo.demo3.observable.HanFeiZi;
import com.demo.demo3.observer.LiSi;
import com.demo.demo3.observer.LiuSi;
import com.demo.demo3.observer.WangSi;

import java.util.Observer;

public class Client {

    public static void main(String[] args) {
        //被观察者
        HanFeiZi hanFeiZi = new HanFeiZi();
        //观察者
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();

        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);
        hanFeiZi.addObserver(liSi);

        //被观察者活动
        hanFeiZi.haveBreakfast();
    }
}