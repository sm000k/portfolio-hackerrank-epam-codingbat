package com.epam.learn.main;


interface IntFunc {
    int calc(int x);
}
public class LambdaDemosy {
    public static int arraySumByFunc(int[] arr, IntFunc func)  {
        int sum = 0;
        for (int element : arr) {
            sum += func.calc(element);
        }
        return sum;
    }
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 7, 8, 9};
        System.out.println( arraySumByFunc(arr, x -> x) );
        System.out.println( arraySumByFunc(arr, x -> x + 1) );
        System.out.println( arraySumByFunc(arr, x -> x * x) );
        System.out.println( arraySumByFunc(arr, x -> (x > 2) ? x : 0) );
        System.out.println( arraySumByFunc(arr, x -> x % 3));

    }
}

