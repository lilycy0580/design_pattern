package com.pattern.demo4.factory.impl;

import com.pattern.demo4.factory.AbstractHumanFactory;
import com.pattern.demo4.human.Human;
import com.pattern.demo4.human.impl.BlackHuman;
import com.pattern.demo4.human.impl.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public YellowHuman createHuman() {
        return new YellowHuman();
    }
}
