package examples.calendar;

import java.util.*;
import java.text.*;

public class changeCurrency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = FormateCurrnecy(Locale.US, payment);
        String india = FormateCurrnecy(new Locale("en", "in"), payment);
        String china = FormateCurrnecy(Locale.CHINA, payment);
        String france = FormateCurrnecy(Locale.FRANCE, payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    public static String FormateCurrnecy(Locale locale, double num){
        return NumberFormat.getCurrencyInstance(locale).format(num);
    }
}
