package org.example.chapter04;

public class SpeedConverter {
    
    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) return -1;

        // 1 miles per hour is 1.609 kilometers per hour
        return Math.round(kilometersPerHour / 1.609d);
    }

    public static void printConversion(double kilometersPerHour) {

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
