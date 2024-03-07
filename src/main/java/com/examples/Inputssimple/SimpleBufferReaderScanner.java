package examples.Inputssimple;

import java.io.IOException;
import java.util.Scanner;

public class SimpleBufferReaderScanner {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int multiple = sc.nextInt();

        for (int i = 1; i < 11; i++) {
//            System.out.printf("%d x %d = %d%n", multiple, i, multiple * i);
        }
    }
}
