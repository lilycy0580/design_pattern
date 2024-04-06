package com.demo.demo1.client;

import com.demo.demo1.factory.MaleFactory;
import com.demo.demo1.factory.impl.FemaleFactory;
import com.demo.demo1.factory.impl.HumanFactory;
import com.demo.demo1.human.Human;

public class NvWa {


    public static void main(String[] args) {

        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("黄种人 女");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();

        System.out.println("--------------------------");

        System.out.println("黄种人 男");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();

    }


}
