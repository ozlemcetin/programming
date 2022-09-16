package org.example.chapter05;

public class NumberPalindrome {

    /*
        Write a method called isPalindrome with one int parameter called number.
     */
    public static boolean isPalindrome(int number) {

        /*
            What is a Palindrome number?
            A palindrome number is a number which when reversed is equal to the original number.
            For example: 121, 12321, 1001 etc.
         */
        return (number == reverseNumber(number));

    }

    public static int reverseNumber(int number) {

        /*
            Tip: Logic to reverse a number

            Declare and initialize another variable to store the reverse of a number, for example reverse = 0.

            Extract the last digit of the given number by performing the modulo division (remainder).
            Store the last digit to some variable say lastDigit = num % 10.
            Increase the place value of reverse by one.
            To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
            Add lastDigit to reverse.
            Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
            Repeat steps until number is not equal to (or greater than) zero
         */
        boolean isNegative = (number < 0);
        int reverse = 0;
        {
            number = Math.abs(number);
            while (number > 0) {

                int lastDigit = number % 10;
                reverse = (reverse * 10) + lastDigit;
                number = number / 10;
            }
        }
        return (isNegative ? (reverse * -1) : reverse);
    }
}
