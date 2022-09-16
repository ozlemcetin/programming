package org.example.chapter05;

public class NumberOfDaysInMonth {

    /*
    Write a method isLeapYear with a parameter of type int named year.

    The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

    If the parameter is not in that range return false.

    Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.

    A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
     */
    public static boolean isLeapYear(int year) {

        //parameter needs to be greater than or equal to 1 and less than or equal to 9999.
        if (!(year >= 1 && year <= 9999)) return false;

        // year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
        boolean divisibleBy4 = (year % 4) == 0;
        boolean divisibleBy100 = (year % 100) == 0;
        boolean divisibleBy400 = (year % 400) == 0;

        return ((divisibleBy4 && !divisibleBy100) || divisibleBy400);
    }

    /*
    Write another method getDaysInMonth with two parameters month and year. Both of type int.

    If parameter month is < 1 or > 12 return -1.

    If parameter year is < 1 or > 9999 then return -1.

    This method needs to return the number of days in the month.

    Be careful about leap years they have 29 days in month 2 (February).

    You should check if the year is a leap year using the method isLeapYear described above.
     */
    public static int getDaysInMonth(int month, int year) {

        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {

            if (month == 1) return 31;
            if (month == 2) return isLeapYear(year) ? 29 : 28;
            if (month == 3) return 31;
            if (month == 4) return 30;
            if (month == 5) return 31;
            if (month == 6) return 30;
            if (month == 7) return 31;
            if (month == 8) return 31;
            if (month == 9) return 30;
            if (month == 10) return 31;
            if (month == 11) return 30;
            if (month == 12) return 31;
        }
        return -1;
    }
}
