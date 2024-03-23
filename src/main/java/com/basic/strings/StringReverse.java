package com.basic.strings;

import java.util.stream.Stream;

public class StringReverse {

    public static void main(String[] args) {
        //String reverse using two pointers
        String name = "PracticeStringReverse";
        char[] charArr = name.toCharArray();
        int start = 0;
        int end = name.length() - 1;
        char temp;
        
        while(start< end){
            temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;

            start++;
            end--;
        }
        Stream.of(charArr).forEach(System.out::print);
        //System.out.println("Reversed string is :" + charArr);
    }
}
