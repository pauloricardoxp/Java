package util;

public class CurrencyConverter{
    public static double IOF = 0.06;

    public static double dolarTotal(double dolarAmount , double dolarPrice){
        return dolarAmount * dolarPrice * (1 + IOF);
    }
}