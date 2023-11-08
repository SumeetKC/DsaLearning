package com.basic;

public class SumElements {
    public static void main(String[] args) {
        //Sum of all elements in an array
        int[] arr = {1,3,5,7,9};
        int sum = 0;
        for(int j : arr){
            sum += j;
        }

        System.out.println("Sum of all Elements is " + sum);
    }
}
