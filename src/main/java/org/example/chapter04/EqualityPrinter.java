package org.example.chapter04;

public class EqualityPrinter {

    public static void printEqual(int num1, int num2, int num3) {

        //If one of the parameters is less than 0, print text "Invalid Value".
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");

        } else {

            /*
            If all numbers are equal print text "All numbers are equal"

            If all numbers are different print text "All numbers are different".

            Otherwise, print "Neither all are equal or different".
             */


            if (num1 == num2 && num2 == num3) {
                System.out.println("All numbers are equal");

            } else if (num1 != num2 && num2 != num3 && num1 != num3) {
                System.out.println("All numbers are different");

            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }
}
