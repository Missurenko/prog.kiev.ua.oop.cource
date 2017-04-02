package com.bogdan.education.progOOP.inheritanceHomeWork;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by Admin on 30.03.17.
 */
@Getter
@Setter
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Point() {
        super();
    }

    @Override
    public String toString() {
        return "Point. Position x " + x + ". Position y " + y;
    }

    public double distancePointtoPoint(Point pointA, Point pointB) {
        return Math.sqrt((Math.pow(pointB.x, 2) - 2 * pointB.x * pointA.x + Math.pow(pointA.x, 2)) +
                (Math.pow(pointB.y, 2) - 2 * pointB.y * pointA.y + Math.pow(pointA.y, 2)));

    }

}
