package org.example.chapter04;

public class PlayingCat {

    /*
        The cats spend most of the day playing.
        In particular, they play if the temperature is between 25 and 35 (inclusive).
        Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
     */
    public static boolean isCatPlaying(boolean isSummer, int temperature) {

        int upperLimit = isSummer ? 45 : 35;
        return (temperature >= 25 && temperature <= upperLimit);
    }
}
