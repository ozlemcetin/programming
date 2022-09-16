package org.example.chapter05;

public class SumOddRange {

    /*
        Write a method called isOdd with an int parameter and call it number.
        The method needs to return a boolean.
     */
    public static boolean isOdd(int number) {

        //Check that number is > 0, if it is not return false.
        if (number <= 0) return false;

        return ((number % 2) != 0);
    }

    /*
        Write a second method called sumOdd that has 2 int parameters start and end,
        which represent a range of numbers.
     */

    public static int sumOdd(int start, int end) {

        /*
            The parameter end needs to be greater than or equal to start and
            both start and end parameters have to be greater than 0.
         */
        if (start <= 0 || end <= 0 || start > end) return -1;

        /*
            The method should use a for loop to sum all odd numbers in that range
            including the end and return the sum.
         */
        int result = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) result += i;
        }//for

        return result;
    }

}
