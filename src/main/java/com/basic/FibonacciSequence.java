package com.basic;

public class FibonacciSequence {
    public static void main(String[] args) {
        //Fibonacci sequence
        System.out.println("Fibonacci Series Normally");
        fibonacci();
        //Fibonacci sequence Recursion
        System.out.println("\nFibonacci Series using Recursion");
        for(int i=0;i<10;i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }



    }

    public static void fibonacci(){

        int a=0;
        int b=1;
        int c=1;

        for(int i=1; i<=10; i++){
            System.out.print(a + " ");
            a=b;
            b=c;
            c=a+b;

        }
    }

    public static int fibonacciRecursion(int i){
        if(i<=1)
            return i;
        return fibonacciRecursion(i-1)+fibonacciRecursion(i-2);
    }
}
