package com.basic.arrays;

import java.util.Arrays;

public class SortedArrayInsert {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 6;
        arr[5] = 7;

        int length = 6;
        int insert = 0;

        int pos = insert(arr, insert, length, 10);
        System.out.println("Element " + insert + " is inserted and the new size of array is " + pos);
        Arrays.stream(arr).forEach(System.out :: print);
    }

    private static int insert(int[] arr, int insert, int length, int cpacity) {
        if(length >= cpacity)
            return length;

        int i;
        for(i = length - 1; (i>=0 && arr[i] > insert); i--){
            arr[i+1] = arr[i];
        }
        arr[i+1] = insert;
        return length + 1;
    }
}
