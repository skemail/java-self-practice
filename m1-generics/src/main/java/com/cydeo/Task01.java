package com.cydeo;

import java.util.Arrays;

public class Task01 {

    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"Java","Python","C++","Maven"};
        swap(arr1,0,4);
        swap(arr2,0,2);


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
    public static  <T>  void swap(T[] arr, int firstIndex, int secondIndex){
        T temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;

    }
}
