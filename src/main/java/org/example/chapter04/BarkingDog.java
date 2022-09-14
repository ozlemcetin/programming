package org.example.chapter04;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) return false;

        /*
        We have to wake up if the dog is barking
        before 8 or after 22 hours so in that case return true.
         */
        return isBarking && (hourOfDay > 22 || hourOfDay < 8);
    }
}
