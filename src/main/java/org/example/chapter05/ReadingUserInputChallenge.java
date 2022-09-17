package org.example.chapter05;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        // sumUserInput() ;

        // averageUserInput();

        // findMaxMinUserInput();

    }

    public static void sumUserInput() {

        Scanner scanner = new Scanner(System.in);
        {
            int sum = 0;
            int counter = 0;
            while (counter < 3) {

                System.out.println("Enter a number #" + (counter + 1) + " : ");
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    sum += number;
                    counter++;
                } else {
                    System.out.println("invalid number");
                }

                // handle next line character (enter key)
                scanner.nextLine();
            }//while loop

            System.out.println("Sum = " + sum);
        }
        scanner.close();
    }

    public static void averageUserInput() {

        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Enter an invalid number to break out of the loop");

            int sum = 0;
            int counter = 0;
            while (true) {

                System.out.println("Enter a number: ");
                boolean hasNextInt = scanner.hasNextInt();
                if (hasNextInt) {
                    int number = scanner.nextInt();
                    sum += number;
                    counter++;
                }

                // handle next line character (enter key)
                scanner.nextLine();

                //condition
                if (!hasNextInt) break;
            }//while loop

            double average = 0d;
            if (counter > 0d) average = (double) (sum) / counter;

            System.out.println("SUM = " + sum + " AVG = " + average);
        }
        scanner.close();
    }

    public static void findMaxMinUserInput() {

        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Enter an invalid number to break out of the loop");

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            boolean userEnteredNumber = false;
            while (true) {

                System.out.println("Enter a number: ");

                boolean hasNextInt = scanner.hasNextInt();
                if (hasNextInt) {
                    int number = scanner.nextInt();
                    userEnteredNumber = true;

                    if (number <= min) min = number;
                    if (number >= max) max = number;
                }

                // handle next line character (enter key)
                scanner.nextLine();

                //condition
                if (!hasNextInt) break;
            }//while loop

            if (!userEnteredNumber) {
                System.out.println("User didn't enter any number!");
            } else {
                System.out.println("Min = " + min);
                System.out.println("Max = " + max);
            }
        }
        scanner.close();
    }


}
