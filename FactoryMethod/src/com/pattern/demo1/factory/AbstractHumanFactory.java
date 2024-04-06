package com.pattern.demo1.factory;

import com.pattern.demo1.human.Human;

public abstract class AbstractHumanFactory {

    // 入参必须是Class类型,返回类型是Human的实现类
    public abstract <T extends Human> T createHuman(Class<T> c);
}
