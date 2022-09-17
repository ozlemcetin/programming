package org.example.chapter05;

public class LargestPrimeFactor {

    //Write a method named getLargestPrime with one parameter of type int named number.
    public static int getLargestPrime(int number) {

        //If the number is negative or does not have any prime numbers,
        // the method should return -1 to indicate an invalid value.
        if (number < 2) return -1;

        //The method should calculate the largest prime factor of a given number and return it.

        /*
            "Prime Factorization" is finding which prime numbers multiply together to make the original number.
            It is best to start working from the smallest prime number, which is 2.
         */

        for (int i = 2; i < number; i++) { // can optimize with i <= number/2;
            if (number % i == 0) {
                number /= i;
                i--; // neutralize the i++ increment to check i again
            }
        }
        return number;
    }

}
