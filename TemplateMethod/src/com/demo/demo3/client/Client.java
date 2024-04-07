package com.demo.demo3.client;

import com.demo.demo3.model.HummerH1Model;
import com.demo.demo3.model.HummerH2Model;
import com.demo.demo3.model.HummerModel;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alarmFlag = scanner.nextInt();
        HummerH1Model h1 = new HummerH1Model();
        if(alarmFlag==1){
            h1.setAlarm(true);
        }else{
            h1.setAlarm(false);
        }
        h1.run();
        System.out.println("--------------------");
        HummerModel h2 = new HummerH2Model();
        h2.run();
    }
}


