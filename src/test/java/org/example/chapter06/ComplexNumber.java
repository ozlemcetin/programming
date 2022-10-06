package org.example.chapter06;

public class ComplexNumber {

    /*
        Write a class with the name ComplexNumber.
        The class needs two fields (instance variables) with name real and imaginary of type double.
        It represents the Complex Number.
     */

    //fields
    private double real;
    private double imaginary;

    //constructors
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //methods
    /*
        Method named add with two parameters real and imaginary of type double,
     */
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber number) {
        if (number != null) {
            this.add(number.getReal(), number.getImaginary());
        }
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber number) {
        if (number != null) {
            this.subtract(number.getReal(), number.getImaginary());
        }
    }

    //setters and getters
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
