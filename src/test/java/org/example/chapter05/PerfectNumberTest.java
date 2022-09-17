package org.example.chapter05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @Test
    void isPerfectNumber() {

        // should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
        Assertions.assertTrue(PerfectNumber.isPerfectNumber(6));

        // should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
        Assertions.assertTrue(PerfectNumber.isPerfectNumber(28));

        // should return false since its only proper divisor is 1 and the sum is 1 not 5
        Assertions.assertFalse(PerfectNumber.isPerfectNumber(5));

        // should return false since the number is < 1
        Assertions.assertFalse(PerfectNumber.isPerfectNumber(-1));
    }
}