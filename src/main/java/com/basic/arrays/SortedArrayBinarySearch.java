package com.basic.arrays;

public class SortedArrayBinarySearch {

    /**
     * In a sorted array, the search operation can be performed by using binary search.
     * Time Complexity: O(log(n)) Using Binary Search
     * Auxiliary Space: O(log(n)) due to recursive calls, otherwise iterative version uses Auxiliary Space of O(1).
     */
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 6;
        arr[5] = 7;

        int length = 6;
        int search = 5;

        int pos = binarySearch(arr, 0, length, search);
        System.out.println("Element found at " + pos);
    }

    public static int binarySearch(int[] arr, int low, int high, int key) {

        if (high < low)
            return -1;

        int mid = (low + high) / 2;
        if (arr[mid] == key)
            return mid;

        return arr[mid] < key ? binarySearch(arr, (mid + 1), high, key) : binarySearch(arr, low, (mid - 1), key);

    }
}
