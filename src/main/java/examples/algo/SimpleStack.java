package examples.algo;


import java.util.Scanner;

public class SimpleStack {
    String[] registerArray = new String[10];
    Integer indexPointer = 0;

    void push(String s) {
        this.indexPointer += 1;
        registerArray[this.indexPointer] = s;
    }

    String pop() {
        String poppedString=registerArray[this.indexPointer];
        this.indexPointer--;
        return poppedString;
    }

    public static void main(String args[]) {
        SimpleStack simpleStack = new SimpleStack();
        Scanner sc = new Scanner(System.in);
        while (simpleStack.indexPointer!=5) {
            simpleStack.push(sc.nextLine());
        }
        while (simpleStack.indexPointer>=0) {

            System.out.println(simpleStack.pop());
        }

    }
}
