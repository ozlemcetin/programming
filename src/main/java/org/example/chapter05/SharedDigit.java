package org.example.chapter05;

public class SharedDigit {

    //Write a method named hasSharedDigit with two parameters of type int.
    public static boolean hasSharedDigit(int num1, int num2) {

        /*
            Each number should be within the range of 10 (inclusive) - 99 (inclusive).
            If one of the numbers is not within the range, the method should return false.
         */
        if (!(num1 >= 10 && num1 <= 99) || !(num2 >= 10 && num2 <= 99)) return false;

        /*
            The method should return true if there is a digit that appears in both numbers,
            such as 2 in 12 and 23; otherwise, the method should return false.
         */
        while (num1 > 0) {
            int lastDigit = num1 % 10;
            if (containsDigit(num2, lastDigit)) return true;
            num1 /= 10;
        }

        return false;
    }

    public static boolean containsDigit(int number, int digit) {

        if (!(digit >= 1 && digit <= 9)) return false;

        number = Math.abs(number);
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit == digit) return true;
            number /= 10;
        }

        return false;
    }
}
