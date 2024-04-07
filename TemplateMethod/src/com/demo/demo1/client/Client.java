package com.demo.demo1.client;

import com.demo.demo1.model.HummerH1Model;
import com.demo.demo1.model.HummerH2Model;
import com.demo.demo1.model.HummerModel;

public class Client {


    public static void main(String[] args) {
        HummerModel h1 = new HummerH1Model();
        h1.run();

        HummerModel h2 = new HummerH2Model();
        h2.run();


    }


}
