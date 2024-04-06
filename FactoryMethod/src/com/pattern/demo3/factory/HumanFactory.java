package com.pattern.demo3.factory;

import com.pattern.demo3.human.Human;

public class HumanFactory {
    public static  <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human= (T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误");
        }
        return (T)human;
    }
}
