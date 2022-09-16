package org.example.chapter05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOddTest {


    @Test
    void isOdd() {

        assertTrue(SumOddRange.isOdd(1));
        assertTrue(SumOddRange.isOdd(3));

        assertFalse(SumOddRange.isOdd(-1));
        assertFalse(SumOddRange.isOdd(0));
        assertFalse(SumOddRange.isOdd(2));
    }

    @Test
    void sumOdd() {

        //should return 2500
        assertEquals(SumOddRange.sumOdd(1, 100), 2_500);


        //should return -1
        assertEquals(SumOddRange.sumOdd(-1, 100), -1);

        //should return 0
        assertEquals(SumOddRange.sumOdd(100, 100), 0);

        //should return 13 (This set contains one number, 13, and it is odd)
        assertEquals(SumOddRange.sumOdd(13, 13), 13);

        //should return -1
        assertEquals(SumOddRange.sumOdd(100, -100), -1);

        //should return 247500
        assertEquals(SumOddRange.sumOdd(100, 1000), 247_500);

    }
}