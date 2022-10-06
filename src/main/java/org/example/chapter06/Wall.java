package org.example.chapter06;

public class Wall {

    //==fields==
    private double width;
    private double height;

    //== constructors ==
    //The first constructor does not have any parameters (no-arg constructor)
    public Wall() {
        this(0.0d, 0.0d);
    }

    public Wall(double width, double height) {

        //In case the width is less than 0 it needs to set the width field value to 0,
        this.width = (width < 0.0d ? 0.0d : width);

        //in case the height parameter is less than 0 it needs to set the height field value to 0.
        this.height = (height < 0.0d ? 0.0d : height);
    }

    //== methods ==
    //Method named getArea without any parameters, it needs to return the area of the wall.
    public double getArea() {
        return (this.height * this.width);
    }

    //==getters & setters ==
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        //In case the width is less than 0 it needs to set the width field value to 0,
        this.width = (width < 0.0d ? 0.0d : width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        //in case the height parameter is less than 0 it needs to set the height field value to 0.
        this.height = (height < 0.0d ? 0.0d : height);
    }
}
