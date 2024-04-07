package com.pattern.demo3;

// 策略枚举类
public enum Calculator {
    // 枚举
    ADD("+"){
        public int exec(int a, int b){
            return a+b;
        }
    },

    SUB("-"){
        public int exec(int a, int b){
            return a-b;
        }
    };

    // 策略类
    String value = "";
    private Calculator(String _value){
        this.value =_value;
    }
    public String getValue(){
        return this.value;
    }
    public abstract int exec(int a, int b);
}
