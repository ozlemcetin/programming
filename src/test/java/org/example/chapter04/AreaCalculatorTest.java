package org.example.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaCalculatorTest {

    @Test
    void area() {

        //area(5.0); should return 78.53975
        assertEquals(AreaCalculator.area(5d), 78.53981633974483d);

        //should return -1 since the parameter is negative
        assertEquals(AreaCalculator.area(-1d), -1d);

        //should return 20.0 (5 * 4 = 20)
        assertEquals(AreaCalculator.area(5d, 4d), 20d);

        //should return -1 since first the parameter is negative
        assertEquals(AreaCalculator.area(-1d, 4d), -1d);


    }
}