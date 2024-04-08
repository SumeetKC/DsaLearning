package com.basic.LinkedList;

public class LinkedListInsertion {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = newNode;
        }
    }

    public void insertBeginning(int data){

        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void insertAfter(int data, int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            Node n = head;
            while(n.next != null){
                if(n.data == data){
                    Node temp = n.next;
                    n.next = newNode;
                    newNode.next = temp;
                }
                n = n.next;
            }
        }
    }

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

    public static void main(String[] args) {
        LinkedListInsertion linkedList = new LinkedListInsertion();
        //Insertion at End
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(6);

        //Insertion at Begin
        linkedList.insertBeginning(0);

        //Insertion after some data
        linkedList.insertAfter(4, 5);

        linkedList.printList();
    }
}
