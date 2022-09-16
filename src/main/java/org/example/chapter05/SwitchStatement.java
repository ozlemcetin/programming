package org.example.chapter05;

public class SwitchStatement {

    public static void main(String[] args) {

        /*
            Incompatible types. Found: 'long', required: 'char, byte, short, int,
             Character, Byte, Short, Integer, String, or an enum'
         */
        {
            int value = 3;
            switchTest(value);

        }

        {
            char ch = 'C';
            switchTest(ch);

            ch = 'F';
            switchTest(ch);

        }

        //with Java 7
        {
            String month = "JANUARY";
            switchTest(month);

            month = "june";
            switchTest(month);

            month = "Junes";
            switchTest(month);
        }
    }

    public static void switchTest(int value) {

        switch (value) {

            case 1:
                System.out.println("value is 1");
                break;

            case 2:
                System.out.println("value is 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("value is 3, 4, or 5");
                System.out.println("value is " + value);
                break;

            default:
                System.out.println("value is not evaluated");
                break;
        }
    }

    public static void switchTest(char ch) {

        switch (ch) {

            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
            case 'C':
            case 'D':
                System.out.println("B, C or D was found");
                break;

            default:
                System.out.println(ch + " is not valid");
                break;
        }
    }

    public static void switchTest(String month) {

        switch (month.toLowerCase()) {

            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
