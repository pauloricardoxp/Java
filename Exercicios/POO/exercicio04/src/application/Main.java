package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dolarAmount = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double dolarPrice = sc.nextDouble();
        double result = CurrencyConverter.dolarTotal(dolarAmount, dolarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);
        sc.close();
    }
}
