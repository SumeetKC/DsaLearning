package com.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamSecondLargestNumberArray {

    public static void main(String[] args) {
        secondLargestNumber();
    }

    private static void secondLargestNumber() {
        //The second-highest element from an array
        int[] arr = new int[]{23, 45, 67, 32, 65};
        int num = Arrays.stream(arr).distinct().sorted().skip(arr.length-2).findFirst().orElseThrow();
        System.out.println("Second Largest number is : " + num);
    }
}
