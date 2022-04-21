package com.hacerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConventer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us =NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india =NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat france =NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat china =NumberFormat.getCurrencyInstance(Locale.CHINA);



        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
