package org.example.chapter06;

public class Point {

    /*
    You have to represent a point in 2D space.
    Write a class with the name Point.
    The class needs two fields (instance variables) with name x and y of type int.
     */

    //==fields==
    private int x;
    private int y;

    //== constructors ==
    //The first constructor does not have any parameters (no-arg constructor)
    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //== methods ==

    /*
        How to find the distance between two points?
        To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:

        d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        Where √ represents square root.
     */

    /*
    Method named distance with two parameters x, y both of type int,
    it needs to return the distance between this Point and Point x,y as double.
     */
    public double distance(int x, int y) {

        int dX = Math.abs(this.x - x);
        int dY = Math.abs(this.y - y);

        return Math.sqrt((dX * dX) + (dY * dY));
    }

    /*
    Method named distance without any parameters,
    it needs to return the distance between this Point and Point 0,0 as double.
     */
    public double distance() {
        return distance(0, 0);
    }

    /*
    Method named distance with parameter another of type Point,
    it needs to return the distance between this Point and another Point as double.
     */
    public double distance(Point p) {
        return distance(p.getX(), p.getY());
    }

    //==getters & setters ==
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
