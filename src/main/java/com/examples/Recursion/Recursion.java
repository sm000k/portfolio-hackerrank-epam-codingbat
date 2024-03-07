package examples.Recursion;

public class Recursion {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        return n + fibonacci(n - 1);
    }

    public static int calculateDec2Bin(int n) {
        if (n == 0) return 0;
        System.out.print(n);
        System.out.println("cz całkowita n = " + n + "reszta= " + n % 2);
        return calculateDec2Bin(n / 2);
    }

    // Decimal to binary conversion
    // using recursion
    public static int findD2B(int decimal_number) {
        System.out.println(decimal_number);
        if (decimal_number == 0)
            return 0;
        else
            return (decimal_number % 2 + 10 *
                    findD2B(decimal_number / 2));
    }

    static int findB2D(int decimal_number) {
        /*            TODO
        jest rekurencja jest przysłanianie ale metoda opiera się na znakach
//      Dla mnie nie zytelna metoda
         */
        return 0;
    }
    public  static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public int factorial(int n) {
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }



}

