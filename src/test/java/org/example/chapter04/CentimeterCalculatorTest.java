package org.example.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterCalculatorTest {


    @Test
    void testConvertFeetAndInchesToCentimeters() {

        //0ft 8in= 20.32cm
        assertEquals(CentimeterCalculator.convertFeetAndInchesToCentimeters(0, 8), 20.32d);

        //5ft = 152.40cm
        assertEquals(CentimeterCalculator.convertFeetAndInchesToCentimeters(5, 0), 152.40d);

        //5ft 7in = 170.18cm
        assertEquals(CentimeterCalculator.convertFeetAndInchesToCentimeters(5, 7), 170.18d);

        //6ft = 182.88cm
        assertEquals(CentimeterCalculator.convertFeetAndInchesToCentimeters(6, 0), 182.88d);

        //Invalid inch range
        assertEquals(CentimeterCalculator.convertFeetAndInchesToCentimeters(6, 15), -1d);

        //Invalid feet range
        assertEquals(CentimeterCalculator.convertFeetAndInchesToCentimeters(-10, 0), -1d);


    }
}