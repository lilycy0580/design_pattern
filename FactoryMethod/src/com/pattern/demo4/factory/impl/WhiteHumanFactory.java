package com.pattern.demo4.factory.impl;

import com.pattern.demo4.factory.AbstractHumanFactory;
import com.pattern.demo4.human.impl.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public WhiteHuman createHuman() {
        return new WhiteHuman();
    }
}
