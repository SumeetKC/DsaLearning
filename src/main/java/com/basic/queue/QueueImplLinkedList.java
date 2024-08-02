package com.basic.queue;

public class QueueImplLinkedList {

    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else {
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
        }
    }

    public void dequeue(){

    }


    public static void main(String[] args) {

    }
}
