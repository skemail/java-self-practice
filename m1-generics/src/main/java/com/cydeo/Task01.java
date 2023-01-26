package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class Task01 {

    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"Java","Python","C++","Maven"};
        swap(arr1,0,4);
        swap(arr2,"Java","Maven");


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
    public static  <T>  void swap(T[] arr, int firstIndex, int secondIndex){
        T temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;

    }
    public static <U> void swap(U[] arr, U firstElement, U secondElement){
        if(arr.length<2){
            System.out.println("Array length less than, 2 nothing to swap");
            return;
        }
        int indexFirstElement = -1, indexSecondElement = -1;
        for (int i = 0;i< arr.length;i++){
            if(arr[i].toString().equals(firstElement.toString())){
                indexFirstElement = i;
            }
            if (arr[i].toString().equals(secondElement.toString())){
                indexSecondElement=i;
            }
        }
        if(indexFirstElement==-1 || indexSecondElement==-1){
            System.out.println("Elements to swap not found");
            return;
        }

        U temp = arr[indexFirstElement];
        arr[indexFirstElement] = arr[indexSecondElement];
        arr[indexSecondElement] = temp;
    }

    public static void print(List<?extends Number> list) {
        for (Number n : list)
            System.out.print(n + " "); System.out.println();
    }
}
