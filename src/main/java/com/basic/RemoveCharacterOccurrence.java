package com.basic;

public class RemoveCharacterOccurrence {
    public static void main(String[] args) {
        //Remove all occurrences of a given character from an input string in Java

        char[] arr= "sumeet".toCharArray();
        char replace = 'm';
        for(int i=0; i<arr.length; i++){
            if(arr[i] == replace){
                arr[i] = ' ';
            }
        }
        System.out.println(arr);

    }
}
