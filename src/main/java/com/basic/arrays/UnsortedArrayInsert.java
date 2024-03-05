package com.basic.arrays;

import java.util.Arrays;

public class UnsortedArrayInsert {

    /**
     * Insertion in an unsorted array at Kth position
     *
     */
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 6;

        int key = 4;
        int k = 3;

        insert(arr,key,k, 5);
        System.out.println("Array after insertion is: ");
        Arrays.stream(arr).forEach(System.out::print);

    }

    public static void insert(int[] data, int key, int pos, int n) {
        for (int i = n-1; i >= pos; i--) {
            data[i+1] = data[i];
            if(i == pos)
                data[pos] = key;
            }
        }
    }
