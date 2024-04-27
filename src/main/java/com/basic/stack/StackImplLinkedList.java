package com.basic.stack;

import com.basic.LinkedList.LinkedListExample;

public class StackImplLinkedList {

    /**
     * Stack Learning resource
     * https://www.geeksforgeeks.org/implement-a-stack-using-singly-linked-list/?ref=lbp
     * Stack Operations:
     * push(): Insert a new element into the stack i.e just insert a new element at the beginning of the linked list.
     * pop(): Return the top element of the Stack i.e simply delete the first element from the linked list.
     * peek(): Return the top element.
     * display(): Print all elements in Stack.
     */

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head;

    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public int pop() {
        if(head == null){
            System.out.println("Stack is empty");
            return -1;
        }

        int data = head.data;
        head = head.next;
        return data;
    }

    public int peek() {
        if(head == null){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }

    public void display() {
        Node currNode = head;

        System.out.print("Elements in Stack are : ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
            // Go to next node
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {

        StackImplLinkedList stack = new StackImplLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();
        System.out.println("\nThe data popped is " + stack.pop());
        System.out.println("The data at top is " + stack.peek());
        System.out.println("\nThe data popped is " + stack.pop());
        System.out.println("The data at top is " + stack.peek());
        stack.display();

    }
}
