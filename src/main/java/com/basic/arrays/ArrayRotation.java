package com.basic.arrays;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int k=3;
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Reversing full array");
        reverseArray(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::print);

        System.out.println("\nReversing first K elements");
        reverseArray(arr, 0, k-1);
        Arrays.stream(arr).forEach(System.out::print);

        System.out.println("\nReversing last elements");
        reverseArray(arr, k, arr.length-1);
        Arrays.stream(arr).forEach(System.out::print);

    }

    public static void reverseArray(int[] array, int start, int end){

        while(start<end) {
            int temp;
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
