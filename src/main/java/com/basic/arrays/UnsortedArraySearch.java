package com.basic.arrays;

public class UnsortedArraySearch {

    /**
     * Search Operation:
     * In an unsorted array, the search operation can be performed by linear traversal from the
     * first element to the last element.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 35, 56, 25, 6};
        int search = 25;
        int pos = findElement(arr, search);
        if (pos != -1)
            System.out.println("Element " + search + " is present in array at position " + pos);
        else
            System.out.println("Element " + search + " is not present in array");
    }

    public static int findElement(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
}
