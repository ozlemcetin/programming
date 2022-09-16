package org.example.chapter04;

public class MinutesToYearsDaysCalculator {

    // it needs to calculate the years and days from the minutes parameter.
    public static void printYearsAndDays(long minutes) {

        //If the parameter is less than 0, print text "Invalid Value".
        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {

            //it needs to print a message in the format "XX min = YY y and ZZ d".

            //1 hour = 60 minutes
            //1 day = 24 hours
            long day = minutes / (60 * 24);

            //1 year = 365 days
            long year = day / 365;
            long remainingDay = day % 365;
            System.out.println(minutes + " min = " + year + " y and " + remainingDay + " d");
        }
    }
}
