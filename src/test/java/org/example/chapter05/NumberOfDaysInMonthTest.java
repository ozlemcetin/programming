package org.example.chapter05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDaysInMonthTest {

    @Test
    void isLeapYear() {

        //should return false since the parameter is not in the range (1-9999)
        assertFalse(NumberOfDaysInMonth.isLeapYear(-1600));

        //should return false since 2017 is not a leap year
        assertFalse(NumberOfDaysInMonth.isLeapYear(2017));

        // should return true since 1600 is a leap year
        assertTrue(NumberOfDaysInMonth.isLeapYear(1600));

        //should return true because 2000 is a leap year
        assertTrue(NumberOfDaysInMonth.isLeapYear(2000));
    }

    @Test
    void getDaysInMonth() {

        //should return 31 since January has 31 days.
        assertEquals(NumberOfDaysInMonth.getDaysInMonth(1, 2020), 31);

        //should return 29 since February has 29 days in a leap year and 2020 is a leap year.
        assertEquals(NumberOfDaysInMonth.getDaysInMonth(2, 2020), 29);

        /*
        should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
         */
        assertEquals(NumberOfDaysInMonth.getDaysInMonth(2, 2018), 28);

        //should return -1 since the parameter month is invalid.
        assertEquals(NumberOfDaysInMonth.getDaysInMonth(-1, 2020), -1);

        //should return -1 since the parameter year is outside the range of 1 to 9999.
        assertEquals(NumberOfDaysInMonth.getDaysInMonth(1, -2020), -1);


    }
}