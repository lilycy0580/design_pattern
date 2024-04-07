package com.pattern.demo1;

public class GivenGreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.println("开绿灯");
    }
}
