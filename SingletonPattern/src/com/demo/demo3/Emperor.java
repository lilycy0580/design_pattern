package com.demo.demo3;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Emperor {

    private static int maxNumOfEmperor = 2;
    private static List<String> nameList = new Vector<>();

    private static List<Emperor> emperorList = new Vector<>();

    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇帝"+i));
        }
    }

    private Emperor(){

    }

    private Emperor(String name){
        nameList.add(name);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    public static void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }



}
