package org.example.chapter06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void distance() {

        Point point = new Point(6, 5);
        {
            //distance(2,2)= 5.0
            Assertions.assertEquals(5.0d, point.distance(2, 2));
        }

        {
            //  distance(0,0)= 7.810249675906654
            Assertions.assertEquals(7.810249675906654d, point.distance());
        }

        {
            Point second = new Point(3, 1);

            //distance(second)= 5.0
            Assertions.assertEquals(5.0d, point.distance(second));
        }

        point = new Point();
        {
            //distance()= 0.0
            Assertions.assertEquals(0.0d, point.distance());
        }

    }
}