package com.basic;

public class Factorial {
    public static void main(String[] args) {
        //Factorial of number using recursion
        System.out.println("Factorial of 10 is " + factorial(10));

    }
    public static long factorial(long n){
        if(n==1)
            return 1;

        return (n* factorial(n-1));
    }
}
