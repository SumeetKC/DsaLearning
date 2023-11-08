package com.basic;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Reverse An array
        int[] arr = {1,2,3,4,5,6};
        int length = arr.length;
        for(int i = 0; i< length/2; i++){
            int temp = arr[length - i - 1];
            arr[length - i - 1] = arr[i];
            arr[i] = temp;
        }

        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}
