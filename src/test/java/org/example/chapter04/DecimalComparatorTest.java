package org.example.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalComparatorTest {

    @Test
    void areEqualByThreeDecimalPlaces() {

        //should return true since numbers are equal up to 3 decimal places.
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));

        //should return false since numbers are not equal up to 3 decimal places
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));

        //should return true since numbers are equal up to 3 decimal places.
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));

        //should return false since numbers are not equal up to 3 decimal places.
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}