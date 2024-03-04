package com.basic.arrays;

import java.util.Arrays;

public class ReverseArray {

    /*
    Time Complexity: O(n)
    The loop runs through half of the array, so it’s linear with respect to the array size.
    Auxiliary Space Complexity: O(1)
    In-place reversal, meaning it doesn’t use additional space.
    */
    public static void main(String[] args) {

        int[] data = {1, 2, 3, 4, 5, 6};
        // Reverse An array using For loop
        System.out.println("Array reverse using For");
        int[] resultFor = reverseArrayUsingFor(data);
        Arrays.stream(resultFor).forEach(x -> System.out.print(x + " "));

        int[] data1 = {1, 2, 3, 4, 5, 6};
        System.out.println("\n" +
                "Array reverse using while");
        int[] resultWhile = reverseArrayWithWhile(data1);
        Arrays.stream(resultWhile).forEach(x -> System.out.print(x + " "));
    }

    private static int[] reverseArrayUsingFor(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = arr[length - i - 1];
            arr[length - i - 1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] reverseArrayWithWhile(int[] arr1) {
        int start = 0, end = arr1.length - 1;
        int temp;
        while (start < end) {
            temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;

            start++;
            end--;
        }
        return arr1;
    }
}
