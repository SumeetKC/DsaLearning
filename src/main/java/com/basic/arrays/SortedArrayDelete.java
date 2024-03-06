package com.basic.arrays;

import java.util.Arrays;

public class SortedArrayDelete {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 6;
        arr[5] = 7;

        int length = 6;
        int key = 5;

        int pos = delete(arr, key, length);
        System.out.println("Element " + key + " is deleted and the new size of array is " + pos);
        Arrays.stream(arr).forEach(System.out::print);
    }

    private static int delete(int[] arr, int key, int length) {
        int index = findElement(arr, key, length);
        if(index == -1)
            return length;
        for (int i = index; i < length; i++) {
            arr[i] = arr[i + 1];
        }
        return length - 1;
    }

    private static int findElement(int[] arr, int key, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == key)
                return i;
        }
        System.out.println("Element not present");
        return -1;
    }
}
