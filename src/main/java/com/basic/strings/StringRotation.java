package com.basic.strings;

import java.util.stream.Stream;

public class StringRotation {

    /*
    Time Complexity: O(N), where N is the size of the given string.
    Auxiliary Space: O(1), no extra space is required, so it is a constant.
     */
    public static void main(String[] args) {

        char[] right = "StringRotationRight".toCharArray();
        //Right Rotation by k elements
        int k = 3;
        reverse(right, 0, right.length-1);
        reverse(right, 0, k-1);
        reverse(right, k, right.length-1);

        System.out.println("String after Right rotation");
        Stream.of(right).forEach(System.out::print);

        char[] left = "StringRotationLeft".toCharArray();
        //Left Rotation by K elements
        reverse(left, 0, k-1);
        reverse(left, k, left.length-1);
        reverse(left, 0, left.length-1);

        System.out.println("\nString after left rotation");
        Stream.of(left).forEach(System.out::print);

    }

    public static char[] reverse(char[] charArr, int start, int end){
        char temp;
        while(start< end){
            temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;

            start++;
            end--;
        }
        return charArr;
    }
}
