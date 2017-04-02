package com.bogdan.education.progOOP.inheritanceHomeWork;



/**
 * Created by Admin on 30.03.17.
 */

public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(double x, double y, double x1, double y1, double x2, double y2) {
        super();
        this.a = new Point(x, y);
        this.b = new Point(x1, y1);
        this.c = new Point(x2, y2);
    }

    @Override
    public double getPerimetr() {
        Point point = new Point();
        return point.distancePointtoPoint(a, b) + point.distancePointtoPoint(b, c) +
                point.distancePointtoPoint(a, c);
    }

    @Override
    public double getArea() {
        Point point = new Point();
        double p = getPerimetr() / 2.0;
        return Math.sqrt(p * (p - point.distancePointtoPoint(a, b)) *
                (p - point.distancePointtoPoint(b, c)) *
                (p - point.distancePointtoPoint(a, c)));
    }

    @Override
    public String toString() {
        return "Triangle. Side A " + a + " side B  " + b + " side C " + c + " Area " + getArea() + " Perimeter "
                + getPerimetr();
    }

}

