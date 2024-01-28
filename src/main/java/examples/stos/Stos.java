package examples.stos;

import java.util.Scanner;
import java.util.Stack;

public class Stos {


    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        while (sc.hasNext()) {
            String input = sc.next();



            System.out.println(stack);
        }
        sc.close();
    }


}
