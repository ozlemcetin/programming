package org.example.chapter05;

public class GreatestCommonDivisor {

    /*
        Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
     */
    public static int getGreatestCommonDivisor(int first, int second) {

        //f one of the parameters is < 10, the method should return -1 to indicate an invalid value.
        if (first < 10 || second < 10) return -1;

        //The method should return the greatest common divisor of the two numbers (int).

        /*
            The greatest common divisor is the largest positive integer that
            can fully divide each of the integers (i.e. without leaving a remainder).
         */
        int greatest = -1;
        {
            int min = Math.min(first, second);
            for (int i = 1; i <= min; i++) {
                if ((first % i == 0) && (second % i == 0)) greatest = i;
            }
        }
        return greatest;
    }
}
