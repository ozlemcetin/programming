package org.example.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {

    @Test
    void hasTeen() {

        //should return true since 19 is in range 13 - 19
        assertTrue(TeenNumberChecker.hasTeen(9, 99, 19));

        //should return true since 15 is in range 13 - 19
        assertTrue(TeenNumberChecker.hasTeen(23, 15, 42));

        //should return false since numbers 22, 23, 34 are not in range 13-19
        assertFalse(TeenNumberChecker.hasTeen(22, 23, 34));
    }

}