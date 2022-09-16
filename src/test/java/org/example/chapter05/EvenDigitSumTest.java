package org.example.chapter05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitSumTest {

    @Test
    void getEvenDigitSum() {

        //should return 20 since 2 + 4 + 6 + 8 = 20
        assertEquals(EvenDigitSum.getEvenDigitSum(123456789), 20);

        //should return 4 since 2 + 2 = 4
        assertEquals(EvenDigitSum.getEvenDigitSum(252), 4);

        //should return -1 since the number is negative
        assertEquals(EvenDigitSum.getEvenDigitSum(-22), -1);
    }

    @Test
    void isEven() {

        assertTrue(EvenDigitSum.isEven(0));
        assertTrue(EvenDigitSum.isEven(2));

        assertFalse(EvenDigitSum.isEven(-1));
        assertFalse(EvenDigitSum.isEven(1));
    }
}