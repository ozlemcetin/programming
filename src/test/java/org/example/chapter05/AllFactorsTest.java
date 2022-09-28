package org.example.chapter05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllFactorsTest {

    @Test
    void printFactors() {

        //should print 1 2 3 6
        AllFactors.printFactors(6);

        // should print 1 2 4 8 16 32
        AllFactors.printFactors(32);

        // should print 1 2 5 10
        AllFactors.printFactors(10);

        //should print "Invalid Value" since number is < 1
        AllFactors.printFactors(-1);
    }
}