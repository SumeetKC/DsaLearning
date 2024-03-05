package com.basic.arrays;

import java.util.Arrays;

public class UnsortedArrayDelete {

    /**
     * In the delete operation, the element to be deleted is searched using the linear search,
     * and then the delete operation is performed followed by shifting the elements.
     */
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 6;

        int k = 3;

        delete(arr, k, 5);
        System.out.println("Array after Deletion is: ");
        Arrays.stream(arr).forEach(System.out::print);

    }

    public static int delete(int[] arr, int key, int length) {

        int pos = findElement(arr, key, length);
        if(pos == -1){
            System.out.println("Element not found");
            return length;
        }

        for(int i = pos; i <= length -1; i++){
            arr[i] = arr[i + 1];
        }

        return length - 1;
    }

    private static int findElement(int[] arr, int key, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
}
