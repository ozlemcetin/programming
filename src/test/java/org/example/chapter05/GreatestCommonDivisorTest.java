package org.example.chapter05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void getGreatestCommonDivisor() {

        /*
            For example 12 and 30:
            12 can be divided by 1, 2, 3, 4, 6, 12
            30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
         */
        Assertions.assertEquals(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30), 6);

        //should return 5 since both can be divided by 5 without a remainder
        Assertions.assertEquals(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15), 5);

        //should return -1 since the first parameter is < 10
        Assertions.assertEquals(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18), -1);

        //should return 9 since both can be divided by 9 without a remainder
        Assertions.assertEquals(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153), 9);
    }
}