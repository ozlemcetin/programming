package org.example.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumCheckerTest {

    @Test
    void hasEqualSum() {

        //should return false since 1 + 1 is not equal to 1
        assertFalse(EqualSumChecker.hasEqualSum(1, 1, 1));

        //should return true since 1 + 1 is equal to 2
        assertTrue(EqualSumChecker.hasEqualSum(1, 1, 2));

        //should return true since 1 + (-1) is 1 - 1 and is equal to 0
        assertTrue(EqualSumChecker.hasEqualSum(1, -1, 0));


    }
}