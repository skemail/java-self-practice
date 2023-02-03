package com.cydeo.task02;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4,7,90,233,196418,514229,634534);
        List<String> s1 = Arrays.asList("one", "two", "three", "four");

        System.out.println(countIf(ci, new OddPredicate()));
        System.out.println(countIf(ci, new EvenPredicate()));
        System.out.println(countIf(ci, new PrimePredicate()));
        System.out.println(countIf(ci, new FibonacciPredicate()));

    }
    public static <T> int countIf(List<T> list, UnaryPredicate<T> u ){
        int count = 0;
        for(T each: list){
            count+=(u.test(each))?1:0;
        }
        return count;
    }
}
