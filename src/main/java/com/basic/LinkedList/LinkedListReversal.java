package com.basic.LinkedList;

import java.util.LinkedList;

public class LinkedListReversal {

    Node head;
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void printList() {
        Node currNode = head;

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
            // Go to next node
            currNode = currNode.next;
        }
    }

    public Node reverseIterative(Node head){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        this.head = prev;
        return prev;
    }
    public static void main(String[] args) {
        //Reverse Linked list

       // reverseUsingJava();

        LinkedListReversal list = new LinkedListReversal();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Linked List before reversal ");
        list.printList();

        System.out.println("\nLinked List after reversal ");

        list.reverseIterative(list.head);
        list.printList();

    }

    private static void reverseUsingJava() {
        LinkedList<String> list = new LinkedList<>();
        list.add("John");
        list.add("Wick");
        list.add("Avengers");

        LinkedList<String> list1 = new LinkedList<>();
        list.descendingIterator().forEachRemaining(list1::add);
        list1.forEach(System.out::println);
    }
}
