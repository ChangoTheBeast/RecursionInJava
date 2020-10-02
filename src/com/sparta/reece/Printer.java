package com.sparta.reece;

public class Printer {

    public void printBeforeRecursion(int number) {
        System.out.println("Before Recursion: " + number);
    }

    public void print(Object message) {
        System.out.println(message);
    }

    public void printAfterRecursion(int number) {
        System.out.println("After Recursion: " + number);
    }

    public void printFac(int n, int r) {
        System.out.println("Factorial of " + n + " = " + r);
    }

    public void printFib(int n, int r) {
        System.out.println("The " + n + "th number in the fibonacci sequence is " + r);
    }
}
