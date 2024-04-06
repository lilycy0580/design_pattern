package com.pattern.demo4.factory.impl;

import com.pattern.demo4.factory.AbstractHumanFactory;
import com.pattern.demo4.human.Human;
import com.pattern.demo4.human.impl.BlackHuman;

public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public BlackHuman createHuman() {
        return new BlackHuman();
    }
}
