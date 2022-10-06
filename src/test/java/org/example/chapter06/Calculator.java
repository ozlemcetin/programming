package org.example.chapter06;

public class Calculator {

    //fields
    private final Floor floor;
    private final Carpet carpet;

    //constructors
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    /*
        Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.
     */

    /*
      To calculate the price, you multiply the area of the floor (width times length)
      by the price per square meter of carpet.

      For example, the area of the floor that is 12 meters long and 10 meters wide is
      120 square meters.
      To cover the floor with a carpet that costs $8 per square meter would cost $960.
   */
    public double getTotalCost() {
        double totalCost = 0.0d;
        {
            if (floor != null && carpet != null) {
                return (floor.getArea() * carpet.getCost());
            }
        }
        return totalCost;
    }
}
