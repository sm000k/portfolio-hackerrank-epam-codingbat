package examples.Recursion;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        System.out.println("    " + n);
        if (n == 1) {
            return true;
        }
        if (n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] inputData = {1, 16, 3};
        for (int i : inputData) {
            System.out.println(isPowerOfTwo(i));
        }


    }
}
