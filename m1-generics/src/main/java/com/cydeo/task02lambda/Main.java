package com.cydeo.task02lambda;

import com.cydeo.task02.EvenPredicate;
import com.cydeo.task02.FibonacciPredicate;
import com.cydeo.task02.OddPredicate;
import com.cydeo.task02.PrimePredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4,7,90,233,196418,514229,634534);
        List<String> s1 = Arrays.asList("one", "two", "three", "four");

        Consumer<List<Integer>> printOddNumbers = p ->{
            for (Integer integer : p) {
                if(integer%2!=0){
                    System.out.print(integer + " ");
                }
            }
            System.out.println();

        };

        printOddNumbers.accept(ci);

        Function<List<Integer>,List<Integer>> fibonacciNumbers = p ->{

            List<Integer> result = new ArrayList<>();
            for (Integer integer : p) {

                if(integer>0&&integer<4){
                    result.add(integer);
                }

                int previousNumber = 2;
                int currentNumber = 3;

                while (integer>currentNumber){
                    int temp = currentNumber;
                    currentNumber = previousNumber+currentNumber;
                    previousNumber = temp;
                    if(currentNumber==integer){
                        result.add(integer);
                    }
                }
            }
            return result;
        };

        System.out.println(fibonacciNumbers.apply(ci));


        Predicate<Integer> isPrime = p ->{
            return p%2!=0&&p%3!=0&&p%5!=0&&p%7!=0;
        };


        System.out.println(isPrime.test(882));

        //System.out.println(countIf(ci, new OddPredicate()));
        //System.out.println(countIf(ci, new EvenPredicate()));
        //System.out.println(countIf(ci, new PrimePredicate()));
        //System.out.println(countIf(ci, new FibonacciPredicate()));


    }
}
