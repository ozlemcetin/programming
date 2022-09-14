package org.example.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarkingDogTest {

    @Test
    void shouldWakeUp() {

        assertTrue(BarkingDog.shouldWakeUp(true, 1));

        //should return false since the dog is not barking.
        assertFalse(BarkingDog.shouldWakeUp(false, 1));
        // should return false, since it's not before 8.
        assertFalse(BarkingDog.shouldWakeUp(true, 8));
        //should return false since the hourOfDay parameter needs to be in a range 0-23.
        assertFalse(BarkingDog.shouldWakeUp(true, -1));
    }

}