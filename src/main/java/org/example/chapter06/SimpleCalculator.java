package org.example.chapter06;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    /*
    ===
     */

    /*
    Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
     */
    public double getAdditionResult() {
        return (this.firstNumber + this.secondNumber);
    }

    /*
    Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
     */
    public double getSubtractionResult() {
        return (this.firstNumber - this.secondNumber);
    }

    /*
     Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
     */
    public double getMultiplicationResult() {
        return (this.firstNumber * this.secondNumber);
    }

    /*
     Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber.
     In case the value of secondNumber is 0 then return 0.
     */
    public double getDivisionResult() {
        return (this.secondNumber != 0.0d ? this.firstNumber / this.secondNumber : 0.0d);
    }

    /*
    ===
     */

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
