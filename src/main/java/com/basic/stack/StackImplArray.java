package com.basic.stack;

public class StackImplArray {

    public static final int MAX = 10;

    int top = -1;
    int[] stack = new int[MAX];

    public void push(int data){
        if(top >= MAX)
            System.out.println("Stack overflow");
        else{
            stack[++top] = data;
            System.out.println("Element pushed into stack is " + data);
        }
    }

    public int pop(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = stack[top--];
            return x;
        }
    }

    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = stack[top];
            return x;
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + stack[i]);
        }
    }

    public static void main(String[] args) {
        StackImplArray s = new StackImplArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
