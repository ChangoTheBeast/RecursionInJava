package com.sparta.reece;

public class Starter {
    public void start() {
        Recursions recursions = new Recursions();
        int input = 10;
        if (input < 0) {
            System.err.println("Please provide a positive number.");
        } else {
            Printer p = new Printer();
            p.printFac(input, recursions.factorial(input));
            p.print("");
            p.printFib(input, recursions.fibonacci(input));
            p.print("\nHead Recursion:\n");
            recursions.headRecursion(input);
            p.print("\nTail Recursion:\n");
            recursions.tailRecursion(input);
        }
    }
}
