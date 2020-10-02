package com.sparta.reece;

public class Recursions {
    Printer p = new Printer();
    public void methodRecursion(int number) {
        if (number == 0) {
            return;
        }

        this.p.printBeforeRecursion(number);
        methodRecursion(--number);
        this.p.printAfterRecursion(number);
    }
    public int factorial(int n) {
        if (n == 0)
            return 1;
        return n*factorial(--n);
    }

    public int fibonacci(int n) {
        if (n==0 || n==1)
            return 1;
        return (fibonacci(n-1) + fibonacci(n-2));
    }

    public void headRecursion(int n) {
        if (n > 0) {
            headRecursion(n - 1);
            this.p.printAfterRecursion(n);
        }
    }
    public void tailRecursion(int n) {
        if (n > 0) {
            this.p.printBeforeRecursion(n);
            tailRecursion(--n);
        }
    }
}