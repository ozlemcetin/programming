package org.example.chapter05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SharedDigitTest {

    @Test
    void hasSharedDigit() {

        //should return true since the digit 2 appears in both numbers
        Assertions.assertTrue(SharedDigit.hasSharedDigit(12, 23));

        //should return true since the digit 5 appears in both numbers
        Assertions.assertTrue(SharedDigit.hasSharedDigit(15, 55));

        //should return false since 9 is not within the range of 10-99
        Assertions.assertFalse(SharedDigit.hasSharedDigit(9, 99));

        Assertions.assertFalse(SharedDigit.hasSharedDigit(12, 56));
    }

    @Test
    void containsDigit() {

        Assertions.assertTrue(SharedDigit.containsDigit(-123, 1));
        Assertions.assertTrue(SharedDigit.containsDigit(123, 2));

        Assertions.assertFalse(SharedDigit.containsDigit(123, 5));
        Assertions.assertFalse(SharedDigit.containsDigit(123, 12));
    }

}