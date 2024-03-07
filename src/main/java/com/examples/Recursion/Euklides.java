package examples.Recursion;

public class Euklides {


    static int  GCD(int m, int n) {
        System.out.println(": "+m+" : "+n);
        if (m == 0) {
            return n;
        } else {
            return GCD(n % m, m);
        }
    }


    public static void main(String[] args) {
        System.out.println(GCD(15,17));

    }
}
