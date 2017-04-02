package com.bogdan.education.progOOP.firstLesson.triangle;

/**
 * Created by Admin on 29.03.17.
 */
public class Main {
    public static void main(String[] arg) {
        Triangle triangle1 = new Triangle();
        System.out.println(triangle1.areaTriangle(7.9, 10.1, 5.3));
        Triangle triangle2 = new Triangle();
        triangle2.setPointA(8.9);
        triangle2.setPointB(9.1);
        triangle2.setPointC(4.3);
        System.out.println(triangle2.areaTriangle
                (triangle2.getPointA(), triangle2.getPointB(), triangle2.getPointC()));
        System.out.println(triangle2.areaTriangleTostring(triangle2.areaTriangle(
                triangle2.getPointA(), triangle2.getPointB(), triangle2.getPointC())));

    }
}
