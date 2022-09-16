package org.example.chapter04;

import org.junit.jupiter.api.Test;

class MinutesToYearsDaysCalculatorTest {

    @Test
    void printYearsAndDays() {

        //should print "525600 min = 1 y and 0 d"
        MinutesToYearsDaysCalculator.printYearsAndDays(525_600);

        //should print "1051200 min = 2 y and 0 d"
        MinutesToYearsDaysCalculator.printYearsAndDays(1_051_200);

        //should print "561600 min = 1 y and 25 d"
        MinutesToYearsDaysCalculator.printYearsAndDays(561_600);
    }
}