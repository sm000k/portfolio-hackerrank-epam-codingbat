package examples;

import examples.Recursion.Recursion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecursionTest {

    @Test
    void calculateDec2Bin() {
        int x = Recursion.calculateDec2Bin(11);
    }

    @Test
    void calculateDec2Bin21() {
        int x = Recursion.calculateDec2Bin(21);
    }

    @Test
    void findD2B() {
        int x = Recursion.findD2B(11);
        System.out.println(x);
    }

    @Test
    void fib() {

        int[] input_arr = {2, 3, 4};
        int[] properArrResults = {1, 2, 3};
        int[] output_arr = {0, 0, 0};

        for (int i = 0; i < input_arr.length; i++) {
            output_arr[i] = Recursion.fib(input_arr[i]);
        }
        Assertions.assertEquals(properArrResults, properArrResults);
    }

}