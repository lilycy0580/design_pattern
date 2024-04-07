package com.pattern.demo3;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String symbol = scanner.next();
        int b = scanner.nextInt();
        System.out.println("输入的参数为："+a+", "+b+", "+symbol);
        System.out.println("运行结果为："+Calculator.ADD.exec(a,b));
    }
}
