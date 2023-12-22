package com.basic;

import java.util.LinkedList;

public class LinkedListReversal {
    public static void main(String[] args) {
        //Reverse Linked list

        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Wick");
        list.add("Avengers");

        LinkedList<String> list1 = new LinkedList<>();
        list.descendingIterator().forEachRemaining(list1::add);
        list1.forEach(System.out::println);
    }
}
