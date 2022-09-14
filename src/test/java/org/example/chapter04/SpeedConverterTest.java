package org.example.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedConverterTest {

    @Test
    void toMilesPerHour() {

        assertEquals(SpeedConverter.toMilesPerHour(10.5d), 7L);
        assertEquals(SpeedConverter.toMilesPerHour(0d), 0L);
    }

    @Test
    void printConversion() {

        //Invalid Value
        SpeedConverter.printConversion(-1d);

        //10.5 km/h = 7 mi/h
        SpeedConverter.printConversion(10.5d);

        //0.0 km/h = 0 mi/h
        SpeedConverter.printConversion(0d);

    }
}