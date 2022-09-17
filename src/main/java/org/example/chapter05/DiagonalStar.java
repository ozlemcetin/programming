package org.example.chapter05;

public class DiagonalStar {

    //Write a method named printSquareStar with one parameter of type int named number.
    public static void printSquareStar(int number) {

        //If number is < 5, the method should print "Invalid Value".
        if (number < 5) {
            System.out.println("Invalid Value");

        } else {

            /*
            printSquareStar(5); should print the following:
            *****
            ** **
            * * *
            ** **
            *****
             */

            int midPoint = number / 2;
            boolean isNumberEven = (number % 2 == 0);
            if (!isNumberEven) midPoint++;

            int lineNumber = 1;
            int control = 0;
            while (lineNumber <= number) {

                if (lineNumber == 1 || lineNumber == number) {
                    //first and last line
                    printFullLine(number);

                } else {

                    if (lineNumber <= midPoint) {
                        control++;
                        printLineWithSpace(number, control);

                    } else if (lineNumber == (midPoint + 1) && isNumberEven) {
                        //print the previous line w/o increment
                        printLineWithSpace(number, control);

                    } else if (lineNumber > midPoint) {
                        control--;
                        printLineWithSpace(number, control);
                    }
                }

                lineNumber++;
            }
        }//while loop

        System.out.println();
    }


    public static void printFullLine(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printLineWithSpace(int number, int controlNumber) {

        for (int i = 1; i <= number; i++) {
            if (i == 1 || i == (1 + controlNumber) || i == (number - controlNumber) || i == number) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}