package com.demo.demo1.client;

import com.demo.demo1.director.Director;
import com.demo.demo1.model.impl.BenzModel;

import java.util.List;
import java.util.Vector;

public class Client {


    public static void main(String[] args) {

        Director director = new Director();

        for (int i = 0; i < 5; i++) {
            director.getABenzModel().run();
        }
        System.out.println("----------------------------");
        for (int i = 0; i < 3; i++) {
            director.getBBenzModel().run();
        }
        System.out.println("----------------------------");
        for (int i = 0; i < 4; i++) {
            director.getCBMWModel().run();
        }
        System.out.println("----------------------------");
        for (int i = 0; i < 2; i++) {
            director.getDBMWModel().run();
        }
    }

}
