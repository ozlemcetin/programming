package org.example.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCalculatorTest {

    @Test
    void isLeapYear() {

        //The following years are not leap years:
        assertFalse(LeapYearCalculator.isLeapYear(1700));
        assertFalse(LeapYearCalculator.isLeapYear(1800));
        assertFalse(LeapYearCalculator.isLeapYear(1900));
        assertFalse(LeapYearCalculator.isLeapYear(2100));
        assertFalse(LeapYearCalculator.isLeapYear(2200));
        assertFalse(LeapYearCalculator.isLeapYear(2300));
        assertFalse(LeapYearCalculator.isLeapYear(2500));
        assertFalse(LeapYearCalculator.isLeapYear(2600));

        //The following years are leap years:
        assertTrue(LeapYearCalculator.isLeapYear(1600));
        assertTrue(LeapYearCalculator.isLeapYear(2000));
        assertTrue(LeapYearCalculator.isLeapYear(2400));

        //isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)
        assertFalse(LeapYearCalculator.isLeapYear(-1600));

        // should return false since 2017 is not a leap year
        assertFalse(LeapYearCalculator.isLeapYear(2017));
    }
}