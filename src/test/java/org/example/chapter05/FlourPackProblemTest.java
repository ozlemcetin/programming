package org.example.chapter05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlourPackProblemTest {

    @Test
    void canPack() {

        Assertions.assertTrue(FlourPackProblem.canPack(2, 4, 9));
        Assertions.assertFalse(FlourPackProblem.canPack(2, 0, 9));

        //should return false since bigCount is negative
        Assertions.assertFalse(FlourPackProblem.canPack(-3, 2, 12));

        //should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo),
        // makes in total 12 kilos and goal is 11 kilos.
        Assertions.assertTrue(FlourPackProblem.canPack(2, 2, 11));

        // should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and
        // we have 1 bag left which is ok as mentioned above.
        Assertions.assertTrue(FlourPackProblem.canPack(0, 5, 4));

        // should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
        Assertions.assertTrue(FlourPackProblem.canPack(1, 0, 5));

        // should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
        Assertions.assertFalse(FlourPackProblem.canPack(1, 0, 4));


    }
}