package com.basic.queue;

import java.util.Arrays;

public class QueueImplArray {

    /**
     * Queue is a linear data structure that follows a particular order in which the operations
     * are performed for storing data. The order is First In First Out (FIFO)
     *
     * Basic Operations on Queue:
     * enqueue(): Inserts an element at the end of the queue i.e. at the rear end.
     * dequeue(): This operation removes and returns an element that is at the front end of the queue.
     * front(): This operation returns the element at the front end without removing it.
     * rear(): This operation returns the element at the rear end without removing it.
     * isEmpty(): This operation indicates whether the queue is empty or not.
     * isFull(): This operation indicates whether the queue is full or not.
     * size(): This operation returns the size of the queue i.e. the total number of elements it contains.
     *
     * Types of Queue:
     * Simple Queue - Simple queue also known as a linear queue is the most basic version of a queue.
     * Here, insertion of an element i.e. the Enqueue operation takes place at the rear end and removal of
     * an element i.e. the Dequeue operation takes place at the front end.
     *
     * Circular Queue - In a circular queue, the element of the queue act as a circular ring. The working
     * of a circular queue is similar to the linear queue except for the fact that the last element is
     * connected to the first element. Its advantage is that the memory is utilized in a better way.
     *
     * Priority Queue - This queue is a special type of queue. Its specialty is that it arranges the
     * elements in a queue based on some priority. The priority can be something where the element with
     * the highest value has the priority so it creates a queue with decreasing order of values.
     *
     * Dequeue - Dequeue is also known as Double Ended Queue. As the name suggests double ended, it means
     * that an element can be inserted or removed from both ends of the queue, unlike the other queues in
     * which it can be done only from one end.
     *
     */

    int front, rear, size, capacity;
    int arr[];

    QueueImplArray(int capacity){
        this.capacity = capacity;
        front = 0;
        this.size = 0;
        rear = capacity - 1;
        arr = new int[this.capacity];
    }

    // Queue is full when size becomes
    // equal to the capacity
    boolean isFull(QueueImplArray queue)
    {
        return (queue.size == queue.capacity);
    }

    // Queue is empty when size is 0
    boolean isEmpty(QueueImplArray queue)
    {
        return (queue.size == 0);
    }

    public void enqueue(int data){
        if(isFull(this)){
            System.out.println("Queue is full already");
        }else {
            this.rear = (this.rear + 1) % this.capacity;
            this.arr[this.rear] = data;
            this.size = this.size + 1;
            System.out.println(data + " added in the queue");
        }
    }

    public void dequeue(){
        if(isEmpty(this)){
            System.out.println("Queue is empty");
        }else{
            int data = this.arr[this.front];
            this.front = (this.front + 1) % this.capacity;
            this.size = this.size - 1;
            System.out.println("Element dequeue is " + data);
        }

    }

    public void printAll(){
        Arrays.stream(this.arr).forEach(System.out::println);
    }

    // Method to get front of queue
    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.arr[this.front];
    }

    // Method to get rear of queue
    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.arr[this.rear];
    }

    public static void main(String[] args) {

        QueueImplArray queue = new QueueImplArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.printAll();
        queue.dequeue();
        queue.printAll();
        System.out.println("Front item is "
                + queue.front());

        System.out.println("Rear item is "
                + queue.rear());

    }
}
