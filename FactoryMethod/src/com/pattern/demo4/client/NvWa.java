package com.pattern.demo4.client;


import com.pattern.demo4.factory.impl.BlackHumanFactory;
import com.pattern.demo4.factory.impl.YellowHumanFactory;
import com.pattern.demo4.human.impl.BlackHuman;
import com.pattern.demo4.human.impl.WhiteHuman;
import com.pattern.demo4.factory.impl.WhiteHumanFactory;
import com.pattern.demo4.human.impl.YellowHuman;

public class NvWa {

    public static void main(String[] args) {


        WhiteHuman whiteHuman = new WhiteHumanFactory().createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        BlackHuman blackHuman = new BlackHumanFactory().createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        YellowHuman yellowHuman = new YellowHumanFactory().createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();


    }


}
