package com.bogdan.education.progOOP.task2;


/**
 * Created by Admin on 30.03.17.
 */

public class Rectangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(double x, double y, double x1, double y1, double x2, double y2,
                     double x3, double y3) {
        super();
        this.a = new Point(x, y);
        this.b = new Point(x1, y1);
        this.c = new Point(x2, y2);
        this.d = new Point(x3, y3);
    }

    @Override
    public double getPerimetr() {

        return 2 * (a.distancePointtoPoint(b) + d.distancePointtoPoint(a));
    }

    @Override
    public double getArea() {

        return a.distancePointtoPoint(b) * b.distancePointtoPoint(c);
    }

    @Override
    public String toString() {
        return "Rectangle. Side A " + a + " Side B " + b + " Side C " + c + " Side D " + d + " Area " +
                String.format("%.2f", getArea()) + " Perimeter "
                + String.format("%.2f", getPerimetr());
    }

}

