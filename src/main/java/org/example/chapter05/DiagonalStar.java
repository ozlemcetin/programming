package org.example.chapter05;

public class DiagonalStar {


    public static void printSquareStar(int number) {

        /*
            If number is < 5, the method should print "Invalid Value".
         */
        if (number < 5) {
            System.out.println("Invalid Value");

        } else {

            /*
                The method should print diagonals to generate a rectangular pattern composed of stars (*).
            */

            /*
                For each row or column, stars are printed based on four conditions (Read them carefully):

                    * In the first or last row

                    * In the first or last column

                    * When the row number equals the column number

                    * When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
            */
            for (int row = 1; row <= number; row++) {
                for (int col = 1; col <= number; col++) {

                    if ((row == 1 || row == number) || (col == 1 || col == number) || (row == col) || (col == (number - row + 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }//for
                System.out.println();
            }//
        }

    }


}