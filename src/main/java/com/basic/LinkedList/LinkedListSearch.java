package com.basic.LinkedList;

public class LinkedListSearch {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
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

    /**
     * Initialize a node pointer, current = head.
     * Do following while current is not NULL
     *  If the current value (i.e., current->key) is equal to the key being searched return true.
     * Otherwise, move to the next node (current = current->next).
     * If the key is not found, return false
     */
    public boolean findIterative(int key) {
        if (head == null) {
            return false;
        } else {
            Node n = head;
            while (n.next != null) {
                if (n.data == key) {
                    return true;
                }
                n = n.next;
            }
        }
        return false;
    }

    /**
     * If the head is NULL, return false.
     * If the head’s key is the same as X, return true;
     * Else recursively search in the next node.
    */
    public boolean findRecursive(Node head, int key) {
        if (head == null) {
            return false;
        }
        if(head.data == key)
            return true;

        return findRecursive(head.next, key);
    }

    public static void main(String[] args) {
        LinkedListSearch linkedList = new LinkedListSearch();
        //Insertion at End
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(6);

        if (linkedList.findIterative(5)) {
            System.out.println("The Element is present with Iterative Approach");
        }else{
            System.out.println("The Element is not present with Iterative Approach");
        }

        if (linkedList.findRecursive(linkedList.head, 5)) {
            System.out.println("The Element is present with Recursive Approach");
        }else{
            System.out.println("The Element is not present with Recursive Approach");
        }
    }
}
