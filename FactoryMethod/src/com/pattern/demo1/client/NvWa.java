package com.pattern.demo1.client;

import com.pattern.demo1.factory.AbstractHumanFactory;
import com.pattern.demo1.factory.impl.HumanFactory;
import com.pattern.demo1.human.impl.BlackHuman;
import com.pattern.demo1.human.impl.WhiteHuman;
import com.pattern.demo1.human.impl.YellowHuman;

public class NvWa {

    public static void main(String[] args) {

        AbstractHumanFactory factory = new HumanFactory();

        WhiteHuman whiteHuman = new WhiteHuman();
        WhiteHuman white = factory.createHuman(whiteHuman.getClass());
        white.getColor();
        white.talk();

        YellowHuman yellowHuman = new YellowHuman();
        YellowHuman yellow = factory.createHuman(yellowHuman.getClass());
        yellow.getColor();
        yellow.talk();

        BlackHuman blackHuman = new BlackHuman();
        BlackHuman black = factory.createHuman(blackHuman.getClass());
        black.getColor();
        black.talk();

    }


}
