package org.example.chapter06;

public class Carpet {

    //fields
    private final double cost;

    //constructors
    public Carpet(double cost) {
        this.cost = (cost < 0 ? 0 : cost);
    }


    //setters and getters
    public double getCost() {
        return cost;
    }
}
