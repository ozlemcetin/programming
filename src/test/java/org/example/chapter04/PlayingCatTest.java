package org.example.chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlayingCatTest {

    @Test
    void isCatPlaying() {

        // should return false since temperature is not in range 25 - 45
        assertFalse(PlayingCat.isCatPlaying(true, 10));

        //should return false since temperature is not in range 25 - 35 (summer parameter is false)
        assertFalse(PlayingCat.isCatPlaying(false, 36));

        assertTrue(PlayingCat.isCatPlaying(true, 36));

        //should return true since temperature is in range 25 - 35
        assertTrue(PlayingCat.isCatPlaying(false, 35));


    }
}