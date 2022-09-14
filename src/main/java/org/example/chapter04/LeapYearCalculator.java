package org.example.chapter04;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {

        /*
        The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
         */
        if (!(year >= 1 && year <= 9999)) return false;

        /*
            To determine whether a year is a leap year, follow these steps:
            1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
            2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
            3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
            4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
            5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
         */

        boolean isEvenlyDivisibleBy4 = (year % 4 == 0);

        //Not divisible by 4
        if (!isEvenlyDivisibleBy4) return false;

        boolean isEvenlyDivisibleBy100 = (year % 100 == 0);

        // divisible by 4 but not divisible by 100
        if (!isEvenlyDivisibleBy100) return true;

        boolean isEvenlyDivisibleBy400 = (year % 400 == 0);
        if (isEvenlyDivisibleBy400) {
            /*
             The following years are leap years: This is because they are evenly divisible by both 100 and 400.
             */
            return true;
        } else {
             /*
             years are not leap years: This is because they are evenly divisible by 100 but not by 400.
             */
            return false;
        }
    }
}
