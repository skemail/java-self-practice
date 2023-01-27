package com.cydeo.task01;

public class AppleListImp2 implements ApplePredicate{

    @Override
    public String test(Apple apple) {
        return "An apple of "+apple.getWeight()+"g";
    }
}
