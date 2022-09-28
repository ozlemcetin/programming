package org.example.chapter06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {


    @Test
    void test() {

        {
            SimpleCalculator calculator = new SimpleCalculator();
            calculator.setFirstNumber(5.0);
            calculator.setSecondNumber(4);

            Assertions.assertEquals(9.0, calculator.getAdditionResult());
            Assertions.assertEquals(1.0, calculator.getSubtractionResult());
            Assertions.assertEquals(20.0, calculator.getMultiplicationResult());
            Assertions.assertEquals(1.25, calculator.getDivisionResult());
        }

        {
            SimpleCalculator calculator = new SimpleCalculator();
            calculator.setFirstNumber(5.25);
            calculator.setSecondNumber(0);

            Assertions.assertEquals(0.0, calculator.getMultiplicationResult());
            Assertions.assertEquals(0.0, calculator.getDivisionResult());
        }

    }

}