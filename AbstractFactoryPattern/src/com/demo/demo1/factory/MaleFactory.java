package com.demo.demo1.factory;

import com.demo.demo1.factory.impl.HumanFactory;
import com.demo.demo1.human.Human;
import com.demo.demo1.human.impl.MaleBlackHuman;
import com.demo.demo1.human.impl.MaleWhiteHuman;
import com.demo.demo1.human.impl.MaleYellowHuman;

public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
