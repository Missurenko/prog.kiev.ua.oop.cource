package com.bogdan.education.progOOP.task2;


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

    public double distancePointtoPoint(Point pointB) {
        double a = Math.pow(pointB.getX(), 2);
        double b = 2 * pointB.getX() * this.getX();
        double c = Math.pow(this.getX(), 2);
        double d = Math.pow(pointB.getY(), 2);
        double e = 2 * pointB.getY() * this.getY();
        double f = Math.pow(this.getY(), 2);
        return Math.sqrt(a - b + c + d - e + f);

    }
    private int locationforPoint(Point point) {
        if (point.getX() < 0 && point.getY() > 0) {
            return 0;
        } else if (point.getX() > 0 && point.getY() > 0) {
            return 1;
        } else if (point.getX() < 0 && point.getY() < 0) {
            return 2;
        } else {
            return 3;
        }
    }
}
