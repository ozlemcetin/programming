package org.example.chapter05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestPrimeTest {

    @Test
    void getLargestPrime() {

        //getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
        Assertions.assertEquals(LargestPrimeFactor.getLargestPrime(21), 7);

        //getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
        Assertions.assertEquals(LargestPrimeFactor.getLargestPrime(217), 31);

        //getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        Assertions.assertEquals(LargestPrimeFactor.getLargestPrime(45), 5);

        //getLargestPrime (0); should return -1 since 0 does not have any prime numbers
        Assertions.assertEquals(LargestPrimeFactor.getLargestPrime(0), -1);

        //getLargestPrime (-1); should return -1 since the parameter is negative
        Assertions.assertEquals(LargestPrimeFactor.getLargestPrime(-1), -1);

        Assertions.assertEquals(LargestPrimeFactor.getLargestPrime(71), 71);
    }
}