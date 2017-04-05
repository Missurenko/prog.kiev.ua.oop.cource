package com.bogdan.education.progOOP.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Admin on 30.03.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String continued ;
        String userWord ;
        Shape triangle = new Triangle();
        do {
            System.out.println("Enter your figure: triangle, rectangle or square");
            userWord = reader.readLine();
            if (userWord.equals("triangle")) {
                triangle = setPointforTriangle(scanLocation(3));
                System.out.println(triangle);
            }
            System.out.println("Enter end if want end");
            continued = reader.readLine();
        } while (!continued.equals("end"));

        Shape rectangle = new Rectangle(10, 10, 10, 15, 15, 10, 20, 20);
        System.out.println(rectangle);
        Shape square = new Square(-10, -10, -10, -15, -15, -10, -20, -20);
        System.out.println(square);
        Shape triangle1 = new Triangle(10, -10, 15, -15, 10, 20);
        System.out.println(triangle1);
        Board board = new Board();

        board.addFigure(triangle1, 1);

        board.addFigure(triangle, 2);
        board.addFigure(rectangle, 1);
        board.addFigure(square, 4);
        System.out.println(board.toString());
        board.deleteFigure(1);
        System.out.println(board.toString());

    }

    private static TreeMap scanLocation(int numberPoint) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Double> location = new TreeMap<>();
        for (int i = 0; i < numberPoint; i++) {
            boolean x = true;
            do {
                System.out.println("Enter coordinate X Point: " + (i + 1));
                double numberX = Double.parseDouble(reader.readLine());
                String stringX = "x" + i;
                if (canBeLocated(location, numberX)) {
                    location.put(stringX, numberX);
                    x = false;
                }
            } while (x);
            boolean y = true;
            do {
                System.out.println("Enter coordinate Y for Point: " + (i + 1));
                double numberY = Double.parseDouble(reader.readLine());
                String stringY = "y" + i;
                if (canBeLocated(location, numberY)) {
                    location.put(stringY, numberY);
                    y = false;
                }
            } while (y);
        }
        return location;
    }
//
    private static Triangle setPointforTriangle(TreeMap location) {
        Triangle basictriangle = new Triangle();
        Set set = location.entrySet();
        Iterator iter = set.iterator();
        Map.Entry me = (Map.Entry) iter.next();
        basictriangle.setA(new Point((Double) location.get("x0"), (Double) location.get("y0")));
        basictriangle.setB(new Point((Double) location.get("x1"), (Double) location.get("y1")));
        basictriangle.setC(new Point((Double) location.get("x2"), (Double) location.get("y2")));

        return basictriangle;
    }

    private static boolean canBeLocated(TreeMap<String, Double> location, double number) {
        boolean continued = true;
        Set set = location.entrySet();
        Iterator iter = set.iterator();
        int i = 0;
        int x = 0;
        int y = 0;
        while (iter.hasNext()) {
            Map.Entry me = (Map.Entry) iter.next();
            if (location.get("x" + i) != null && location.get("x" + i) == number) {
                x++;
            }
            if (location.get("y" + i) != null && location.get("x" + i) == number) {
                y++;
            }
//            if (x == 2 & y == 1 || x == 1 & y == 2) {
//                System.out.println("Wrong position point for X. No can set.");
//                return false;
            if (x == 3) {
                System.out.println("Wrong position point. No can set.");
                return false;
            } else if (y == 3) {
                System.out.println("Wrong position point for Y. No can set.");
                return false;
            }
            i++;
        }
        String ss = "hh";
        return continued;
    }
}

