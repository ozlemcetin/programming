package org.example.chapter04;

public class TeenNumberChecker {

    /*
    We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
     */
    public static boolean isTeen(int num) {
        return (num >= 13 && num <= 19);
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        /*
        The method should return boolean and it needs to return true
        if one of the parameters is in range 13(inclusive) - 19 (inclusive).
        Otherwise return false.
         */
        return (isTeen(num1) || isTeen(num2) || isTeen(num3));
    }
}
