package examples.stringasy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class multiListInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<List<Integer>> list = new ArrayList<>();
        String firstLine = scanner.nextLine();
        Integer n = Integer.parseInt(firstLine);
//        System.out.println();
//        System.out.println(n);
        for (int i = 0; i < n; i++) {

            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            List<Integer> row = new ArrayList<>();
            for (String number : numbers) {
                row.add(Integer.parseInt(number));
            }

            list.add(row);
        }

        for (List<Integer> row : list) {
            for (int number : row) {
//                System.out.print(number + " ");
            }
//            System.out.println();
        }
//        System.out.println();

        String NumberOfQueries = scanner.nextLine();
        Integer q = Integer.parseInt(NumberOfQueries);
//        System.out.println(q);

        List<List<Integer>> qlist = new ArrayList<>();
        for (int h = 0; h < q; h++) {
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            List<Integer> row = new ArrayList<>();
            for (String number : numbers) {
                row.add(Integer.parseInt(number));
            }
            qlist.add(row);
        }
//        System.out.println(qlist);
        for (List<Integer> el : qlist) {
//            System.out.println(el);
            if (el.get(0) > n) {
                System.out.println("ERROR!");
            } else {
                if (el.get(1) > list.get(el.get(0)-1).get(0)) {
                    System.out.println("ERROR!");
                } else {
                    int qn=el.get(0)-1;
                    int qh = el.get(1);
//                    System.out.println(qn+" "+qh);
                    System.out.println(list.get(qn).get(qh));
                }

            }
            scanner.close();
        }
    }
}
