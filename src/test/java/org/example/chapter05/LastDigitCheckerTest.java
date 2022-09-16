package org.example.chapter05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LastDigitCheckerTest {

    @Test
    void hasSameLastDigit() {

        //should return true since 1 is the rightmost digit in numbers 41 and 71
        Assertions.assertTrue(LastDigitChecker.hasSameLastDigit(41, 22, 71));

        //should return true since 2 is the rightmost digit in numbers 32 and 42
        Assertions.assertTrue(LastDigitChecker.hasSameLastDigit(23, 32, 42));

        //should return false since 9 is not within the range of 10-1000
        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(9, 99, 999));

        Assertions.assertFalse(LastDigitChecker.hasSameLastDigit(21, 22, 23));
    }
}