package com.pattern.demo2;

public class Client {
    public static void main(String[] args) {
        // 策略一:
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doSomething();

        // 策略二：
        strategy = new ConcreteStrategy2();
        Context context1 = new Context(strategy);
        context1.doSomething();
    }
}
