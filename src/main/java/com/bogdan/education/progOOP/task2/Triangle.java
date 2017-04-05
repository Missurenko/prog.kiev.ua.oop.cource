package com.bogdan.education.progOOP.task2;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by Admin on 30.03.17.
 */
@Getter
@Setter
public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
        super();
    }

    public Triangle(double x, double y, double x1, double y1, double x2, double y2) {
        super();
        this.a = new Point(x, y);
        this.b = new Point(x1, y1);
        this.c = new Point(x2, y2);

    }

    @Override
    public double getPerimetr() {
        double x = a.distancePointtoPoint(b);
        double y = b.distancePointtoPoint(c);
        double z = c.distancePointtoPoint(a);

        return x + y + z;
    }

    // Here think can be do better
    @Override
    public double getArea() {

        double p = getPerimetr() / 2.0;
        return Math.sqrt(p * (p - a.distancePointtoPoint(b)) *
                (p - b.distancePointtoPoint(c)) *
                (p - c.distancePointtoPoint(a)));
    }

    @Override
    public String toString() {
        return "Triangle. Side A " + a + " side B  " + b + " side C " + c + " Area " +
                String.format("%.2f", getArea()) + " Perimeter "
                + String.format("%.2f", getPerimetr());
    }

}

