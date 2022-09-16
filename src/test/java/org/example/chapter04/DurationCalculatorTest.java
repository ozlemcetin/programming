package org.example.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DurationCalculatorTest {

    @Test
    void getDurationString() {

        assertEquals(DurationCalculator.getDurationString(21, 40), "0h 21m 40s");

        assertEquals(DurationCalculator.getDurationString(1300), "0h 21m 40s");

        assertEquals(DurationCalculator.getDurationString(120, 0), "2h 0m 0s");

        assertEquals(DurationCalculator.getDurationString(7200), "2h 0m 0s");

        assertEquals(DurationCalculator.getDurationString(61, 0), "1h 1m 0s");

        assertEquals(DurationCalculator.getDurationString(65, 45), "1h 5m 45s");
    }


}