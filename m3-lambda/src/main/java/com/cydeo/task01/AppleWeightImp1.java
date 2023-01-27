package com.cydeo.task01;


public class AppleWeightImp1 implements ApplePredicate{
    @Override
    public String test(Apple apple) {
        return "A " + (  (apple.getWeight()>150)? "Heavy " : "Light " ) +  apple.getColor() +" apple";
    }
}
