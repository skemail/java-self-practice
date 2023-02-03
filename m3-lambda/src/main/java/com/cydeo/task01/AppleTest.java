package com.cydeo.task01;

import java.util.ArrayList;
import java.util.List;
import static com.cydeo.task01.Color.*;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> list = new ArrayList<>();

        list.add(new Apple(GREEN,130));
        list.add(new Apple(RED,160));
        list.add(new Apple(RED,110));
        list.add(new Apple(GREEN,170));
        list.add(new Apple(GREEN,155));

        prettyPrintApple(list,new AppleWeightImp1());

        System.out.println("----------------------------------------------------------");

        prettyPrintApple(list,new AppleListImp2());

    }
    public static void prettyPrintApple(List<Apple> inventory, ApplePredicate p){
        for(Apple apple : inventory){
            String output = p.test(apple);
            System.out.println(output); }
    }
}
