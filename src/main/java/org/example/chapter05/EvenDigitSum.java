package org.example.chapter05;

public class EvenDigitSum {

    //Write a method named getEvenDigitSum with one parameter of type int called number.
    public static int getEvenDigitSum(int number) {

        //If the number is negative, the method should return -1 to indicate an invalid value.
        if (number < 0) return -1;

        //The method should return the sum of the even digits within the number.
        int result = 0;
        {
            while (number > 0) {
                int lastDigit = number % 10;
                if (isEven(lastDigit)) result += lastDigit;
                number = number / 10;
            }
        }
        return result;
    }

    public static boolean isEven(int number) {
        if (number < 0) return false;
        return ((number % 2) == 0);
    }
}
