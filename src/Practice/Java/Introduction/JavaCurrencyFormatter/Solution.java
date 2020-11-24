package Practice.Java.Introduction.JavaCurrencyFormatter;

import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat numberFormatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat numberFormatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = numberFormatUS.format(payment);
        String india = numberFormatIndia.format(payment);
        String china = numberFormatChina.format(payment);
        String france = numberFormatFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
