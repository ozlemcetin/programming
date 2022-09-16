package org.example.chapter05;

public class LastDigitChecker {

    //Write a method named hasSameLastDigit with three parameters of type int.
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        /*
            Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
            If one of the numbers is not within the range, the method should return false.
         */
        if (!isNumberWithinRange(num1) || !isNumberWithinRange(num2) || !isNumberWithinRange(num3)) return false;

        /*
            The method should return true if at least two of the numbers share the same rightmost digit;
            otherwise, it should return false.
         */
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int lastDigit3 = num3 % 10;
        return ((lastDigit1 == lastDigit2) || (lastDigit2 == lastDigit3) || (lastDigit1 == lastDigit3));
    }

    public static boolean isNumberWithinRange(int number) {
        //Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
        return (number >= 10 && number <= 1_000);
    }

}
