package com.bogdan.education.progOOP.inheritanceHomeWork;



/**
 * Created by Admin on 30.03.17.
 */

public class Square extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square(double x, double y, double x1, double y1, double x2, double y2,
                  double x3, double y3) {
        super();
        this.a = new Point(x, y);
        this.b = new Point(x1, y1);
        this.c = new Point(x2, y2);
        this.d = new Point(x3, y3);
    }

    @Override
    public double getPerimetr() {
        Point point = new Point();
        return 4 * point.distancePointtoPoint(a, b);
    }

    @Override
    public double getArea() {
        Point point = new Point();
        return point.distancePointtoPoint(a, b) * point.distancePointtoPoint(a, b);
    }

    public String toString() {
        return "Square. Side A " + a + " Side B " + b + " Side C " + c + " Side D " + d + " Area " + getArea()
                + " Perimeter " + getPerimetr();
    }
}
