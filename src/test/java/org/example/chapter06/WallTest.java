package org.example.chapter06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WallTest {

    @Test
    void getArea() {

        Wall wall = new Wall(5, 4);

        //area= 20.0
        Assertions.assertEquals(20.0d, wall.getArea());

        //width= 5.0
        Assertions.assertEquals(5.0d, wall.getWidth());

        //height= 4.0
        Assertions.assertEquals(4.0d, wall.getHeight());

        //height= 0.0
        wall.setHeight(-1.5);
        Assertions.assertEquals(0.0d, wall.getHeight());

        //area= 0.0
        Assertions.assertEquals(0.0d, wall.getArea());

    }
}