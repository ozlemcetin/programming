package org.example.chapter05;

public class PrimeCalculator {

    public static boolean isPrime(int number) {
        //must be greater than 1
        if (number <= 1) return false;

        int upperLimit = (int) Math.sqrt(number);
        for (int i = 2; i <= upperLimit; i++) {
            if ((number % i) == 0) return false;
        }
        return true;
    }
}
