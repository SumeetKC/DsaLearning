package com.basic.strings;

import java.util.HashMap;

public class CharacterFrequency {
    /*
    Problem : Print the frequency of each character in Alphabetical order
    Approach :
        Create a Map to store the frequency of each of the characters of the given string.
        Iterate through the string and check if the character is present in the map.
        If the character is not present, insert it in the map with 1 as the initial value else increment its frequency by 1.
        Finally, print the frequency of each of the character in alphabetical order.

    Time Complexity: O(n),for traversing string.
    Auxiliary Space: O(n),for map.
     */
    public static void main(String[] args) {
        String value = "CharacterFrequency";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : value.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        map.entrySet().stream().forEach(x ->
                System.out.println("The Character " + x.getKey() + " and the frequency is " + x.getValue()));
    }
}
