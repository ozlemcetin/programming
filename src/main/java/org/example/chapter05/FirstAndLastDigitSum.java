package org.example.chapter05;

public class FirstAndLastDigitSum {

    //Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    public static int sumFirstAndLastDigit(int number) {

        //If the number is negative then the method needs to return -1 to indicate an invalid value.
        if (number < 0) return -1;

        /*
            The method needs to find the first and the last digit of the parameter number passed to the method,
            using a loop and return the sum of the first and the last digit of that number.
         */

        int lastDigit = number % 10;
        int firstDigit = lastDigit;
        number = number / 10;
        while (number > 0) {
            firstDigit = number % 10;
            number = number / 10;
        }

        return (firstDigit + lastDigit);
    }
}
