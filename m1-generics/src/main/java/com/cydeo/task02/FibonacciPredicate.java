package com.cydeo.task02;

public class FibonacciPredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer obj) {
        if(obj>0&& obj<4){
            return true;
        }

        int previousNumber = 2;
        int currentNumber = 3;

        while (obj>currentNumber){
            int temp = currentNumber;
            currentNumber = previousNumber+currentNumber;
            previousNumber = temp;
            System.out.println(currentNumber);
            if(currentNumber==obj){
                return true;
            }
        }

        return false;
    }
}
