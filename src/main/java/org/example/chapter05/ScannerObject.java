package org.example.chapter05;

import java.util.Scanner;

public class ScannerObject {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        {

            System.out.println("Enter your year of birth: ");

            int yearOfBirth = 0;
            if (scanner.hasNextInt()) {
                yearOfBirth = scanner.nextInt();
                scanner.nextLine(); // handle next line character (enter key)
            }

            int age = 2022 - yearOfBirth;
            if (yearOfBirth <= 0 || !(age >= 0 && age <= 100)) {
                System.out.println("Invalid year of birth");
            } else {

                System.out.println("Enter your name: ");
                String name = scanner.nextLine();

                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            }
        }
        scanner.close();

    }
}


