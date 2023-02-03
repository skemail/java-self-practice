package com.cydeo.task01lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static com.cydeo.task01lambda.Color.*;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> list = new ArrayList<>();

        list.add(new Apple(GREEN,130));
        list.add(new Apple(RED,160));
        list.add(new Apple(RED,110));
        list.add(new Apple(GREEN,170));
        list.add(new Apple(GREEN,155));

        System.out.println("/////////////////////////CONSUMER//////////////////////////////");

        Consumer<Apple> appleWeightConsumer = apple -> System.out.println("An apple of "+apple.getWeight()+"g");

        for (int i = 0 ; i< list.size() ; i++){
            appleWeightConsumer.accept(list.get(i));
        }

        System.out.println("/////////////////////////FUNCTION//////////////////////////////");

        Function<Apple ,String> appleWeightFunction = p -> "An apple of "+p.getWeight()+"g";

        for (Apple apple : list) {
            System.out.println(appleWeightFunction.apply(apple));
        }

        System.out.println("/////////////////////////PREDICATE//////////////////////////////");

        Predicate<Apple> applePredicate = apple -> apple.getWeight()>150;

        for (Apple apple : list) {
            System.out.println("A "+ (applePredicate.test(apple)?"Heavy ":"Light ")+ apple.getColor()+" apple" );
        }

        System.out.println("/////////////////////////CONSUMER//////////////////////////////");

        Consumer<Apple> appleWeightColorConsumer = apple ->
                System.out.println("A " +(apple.getWeight()>150?"Heavy ":"Light ")+ apple.getColor()+" apple");

        for (Apple apple : list) {
            appleWeightColorConsumer.accept(apple);
        }

        System.out.println("/////////////////////////FUNCTION//////////////////////////////");

        Function<Apple ,String> appleWeightColorFunction = p -> "A " +(p.getWeight()>150?"Heavy ":"Light ")+ p.getColor()+" apple";

        for (Apple apple : list) {
            System.out.println(appleWeightColorFunction.apply(apple));
        }


    }
}
