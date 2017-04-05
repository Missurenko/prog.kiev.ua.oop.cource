package com.bogdan.education.progOOP.task1.triangle;

import java.text.NumberFormat;

/**
 * Created by Admin on 29.03.17.
 */
public class Triangle {
    private final double pointA;
    private final double pointB;
    private final double pointC;
    private Double areaTriangle;


    public Triangle(double pointA, double pointB, double pointC) {

        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public double getPointA() {
        return pointA;
    }

    public double getPointB() {
        return pointB;
    }

    public double getPointC() {
        return pointC;
    }

    public double areaTriangle() {
        if (areaTriangle == null) {
            double p = (pointA + pointB + pointC) / 2;
            areaTriangle = Math.sqrt(p * (p - pointA) * (p - pointB) * (p - pointC));
        }
        return areaTriangle;
    }

    public String areaTriangleTostring() {
        return NumberFormat.getInstance().format(areaTriangle());
    }


}
