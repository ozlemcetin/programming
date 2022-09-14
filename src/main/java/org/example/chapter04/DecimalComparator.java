package org.example.chapter04;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        /*
        it needs to return true if two double numbers are the same up to three decimal places.
         */
        int decimalPlaces = 3;
        int a = (int) (num1 * Math.pow(10, decimalPlaces));
        int b = (int) (num2 * Math.pow(10, decimalPlaces));

        return (a == b);
    }

}
