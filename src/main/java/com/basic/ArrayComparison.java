package com.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayComparison {
    public static void main(String[] args) {
        //if two arrays contain the same elements.
        int[] arr1 = {1,5,8,77,44,33};
        int[] arr2 = {1,5,8,77,44,33};
        int[] arr3 = {1,5,8,77,44,55};

        Set<Object> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Object> set2 = new HashSet<>(Arrays.asList(arr3));
        for(Object o : set1){
            if(!set2.contains(o))
                System.out.println("Arrays are not equal");
        }
        System.out.println("Arrays are equal");
    }
}
