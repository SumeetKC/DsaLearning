package com.basic;

import java.util.Arrays;

public class MaximumElement {
    public static void main(String[] args) {
    // Find the maximum element in an array
        int[] arr = {4,6,2,3,9};
        int maximum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maximum)
                maximum = arr[i];
        }
        System.out.println("Maximum : " + maximum);
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}