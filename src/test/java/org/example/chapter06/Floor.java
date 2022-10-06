package org.example.chapter06;

public class Floor {

    //fields
    private final double width;
    private final double length;

    //constructors
    public Floor(double width, double length) {
        this.width = (width < 0 ? 0 : width);
        this.length = (length < 0 ? 0 : length);
    }

    //methods
    public double getArea() {
        return (width * length);
    }

    //setters and getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
