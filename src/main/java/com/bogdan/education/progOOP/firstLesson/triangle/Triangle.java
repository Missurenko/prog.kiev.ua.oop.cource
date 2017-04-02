package com.bogdan.education.progOOP.firstLesson.triangle;

import java.text.NumberFormat;

/**
 * Created by Admin on 29.03.17.
 */
public class Triangle {
    private double pointA;
    private double pointB;
    private double pointC;

    public double getPointA() {
        return pointA;
    }

    public void setPointA(double pointA) {
        this.pointA = pointA;
    }

    public double getPointB() {
        return pointB;
    }

    public void setPointB(double pointB) {
        this.pointB = pointB;
    }

    public double getPointC() {
        return pointC;
    }

    public void setPointC(double pointC) {
        this.pointC = pointC;
    }

    public double areaTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String areaTriangleTostring(double areaTriangle) {
        return NumberFormat.getInstance().format(areaTriangle);
    }


}
