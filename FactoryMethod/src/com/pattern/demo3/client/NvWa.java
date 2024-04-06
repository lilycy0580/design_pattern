package com.pattern.demo3.client;


import com.pattern.demo3.factory.HumanFactory;
import com.pattern.demo3.human.Human;
import com.pattern.demo3.human.impl.BlackHuman;
import com.pattern.demo3.human.impl.WhiteHuman;
import com.pattern.demo3.human.impl.YellowHuman;

public class NvWa {

    public static void main(String[] args) {

        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();



    }


}
