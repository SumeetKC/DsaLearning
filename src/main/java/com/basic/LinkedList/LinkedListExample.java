package com.basic.LinkedList;

public class LinkedListExample {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    private void add(int value) {
        Node node = new Node(value);
        // If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = node;
        } else {
            //Else traverse till the last node and insert the new_node there
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            // Insert the new_node at last node
            n.next = node;
        }

    }

    // Method to print the LinkedList.
    public void printList() {
        Node currNode = head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
            // Go to next node
            currNode = currNode.next;
        }
    }

    private void delete(int data) {
        // CASE 1:
        // If head node itself holds the key to be deleted
        if (head.data == data) {
            head = head.next;
        } else {

            /** CASE 2: If the key is somewhere other than at head.

             Search for the key to be deleted, keep track of the previous node
             as it is needed to change currNode.next
             */

            Node prev = head;
            Node curr = head.next;
            while (curr != null && curr.data != data) {
                prev = curr;
                curr = curr.next;
            }

            // If the key was present, it should be at currNode. Therefore the currNode shall not be null
            if (curr != null) {
                prev.next = curr.next;
                // Display the message
                System.out.println(data + " found and deleted");
            } else {
                // Display the message
                System.out.println(data + " not found");
            }
        }
    }

    private void deleteAt(int pos) {
        int counter = 2;
        if (pos == 1) {
            head = head.next;
        } else {
            Node prev = head;
            Node curr = head.next;
            while (curr != null && counter != pos) {
                prev = curr;
                curr = curr.next;
                counter++;
            }

            if (curr != null) {
                prev.next = curr.next;
                System.out.println("Element deleted");
            } else {
                System.out.println("Element not found at given index");
            }
        }
    }

    public static void main(String[] args) {
        LinkedListExample ex = new LinkedListExample();
        ex.add(1);
        ex.add(2);
        ex.add(3);
        ex.add(4);
        ex.add(5);
        ex.printList();

        //ex.delete(10);
        ex.deleteAt(5);
        ex.printList();
    }
}
