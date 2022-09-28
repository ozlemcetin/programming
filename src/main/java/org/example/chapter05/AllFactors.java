package org.example.chapter05;

public class AllFactors {

    /*
        Write a method named printFactors with one parameter of type int named number.
     */
    public static void printFactors(int number) {

        //If number is < 1, the method should print "Invalid Value".
        if (number < 1) {
            System.out.println("Invalid Value");

        } else {
            /*
            The method should print all factors of the number.
            A factor of a number is an integer which divides that number wholly
            (i.e. without leaving a remainder).
            */
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
