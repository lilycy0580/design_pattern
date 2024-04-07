package com.demo.demo1.client;

import com.demo.demo1.observable.impl.HanFeiZi;
import com.demo.demo1.observer.Observer;
import com.demo.demo1.observer.impl.LiSi;
import com.demo.demo1.observer.impl.LiuSi;
import com.demo.demo1.observer.impl.WangSi;

public class Client {

    public static void main(String[] args) {
        Observer lisi = new LiSi();
        Observer liusi = new LiuSi();
        Observer wangsi = new WangSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(liusi);
        hanFeiZi.addObserver(wangsi);

        hanFeiZi.haveBreakfast();

    }



}
