package com.demo.demo1.model;

import java.util.List;
import java.util.Vector;

public abstract class CarModel {
    private List<String> sequence = new Vector<>();
    final public void setSequence(List<String> list){
        this.sequence = list;
    }

    // 基本方法
    protected abstract void start();
    protected abstract void alarm();
    protected abstract void engineBoom();
    protected abstract void stop();

    // 模板方法
    final public void run(){
        for (int i = 0; i < sequence.size(); i++) {
            String name = sequence.get(i);
            if(name.equalsIgnoreCase("start")){
                this.start();
            } else if (name.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (name.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (name.equalsIgnoreCase("engineBoom")) {
                this.engineBoom();
            }
        }
    }
}
