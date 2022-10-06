package org.example.chapter06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void getTotalCost() {

        {
            Floor floor = new Floor(2.75, 4.0);
            System.out.println("area= " + floor.getArea());

            Carpet carpet = new Carpet(3.5);
            System.out.println("cost= " + carpet.getCost());

            Calculator calculator = new Calculator(floor, carpet);
            System.out.println("total= " + calculator.getTotalCost());

            Assertions.assertEquals(38.5d, calculator.getTotalCost());
        }

        {
            Floor floor = new Floor(5.4, 4.5);
            System.out.println("area= " + floor.getArea());

            Carpet carpet = new Carpet(1.5);
            System.out.println("cost= " + carpet.getCost());

            Calculator calculator = new Calculator(floor, carpet);
            System.out.println("total= " + calculator.getTotalCost());

            Assertions.assertEquals(36.45d, calculator.getTotalCost());
        }
    }
}