package org.example.chapter04;

public class AreaCalculator {

    //represents the area of a circle.
    public static double area(double radius) {

        //if the parameter radius is negative then return -1.0 to represent an invalid value.
        if (radius < 0d) return -1d;

        //The formula for calculating a circle area is radius * radius * PI.
        return (radius * radius * Math.PI);
    }

    // where x and y represent the sides of a rectangle.
    // The method needs to return an area of a rectangle.
    public static double area(double x, double y) {

        //If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
        if (x < 0d || y < 0d) return -1d;

        //The formula for calculating the area of a rectangle is x * y.
        return (x * y);
    }
}
