package org.example.chapter04;

public class CentimeterCalculator {


    public static double convertFeetAndInchesToCentimeters(int feet, int inches) {

        if (feet < 0 || !(inches >= 0 && inches <= 12)) return -1;

        // 1 foot = 12 inches
        int totalInches = (feet * 12) + inches;
        return convertFeetAndInchesToCentimeters(totalInches);

    }

    public static double convertFeetAndInchesToCentimeters(int inches) {

        if (inches < 0) return -1;

        //1 inch = 2.54cm
        return (inches * 2.54d);
    }

}
