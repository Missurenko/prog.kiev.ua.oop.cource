package com.bogdan.education.progOOP.task2;

/**
 * Created by Admin on 30.03.17.
 */
public class Board {
    private Shape[] blackboard = new Shape[4];

    public void addFigure(Shape shape, int i) {
        if (blackboard[i - 1] == null) {
            blackboard[i - 1] = shape;
            System.out.println("Figure has been added in location " + i);
        } else {
            System.out.println("Location " + i + " is occupied.");
        }
    }

    public void deleteFigure(int i) {
        if (blackboard[i] != null) {
            blackboard[i] = null;
            System.out.println("Figure has been deleted from " + i + " location.");
        }
    }

    @Override
    public String toString() {
        String shapesName = "";
        double shapesArea = 0;
        double shapesPerimeter = 0;
        int i = 1;
        for (Shape part : blackboard) {
            if (part != null) {
                String[] allName = part.getClass().getName().split("\\.");
                shapesName += i + ") " + allName[5] + "\n";
                shapesArea += part.getArea();
                shapesPerimeter += part.getPerimetr();
            } else {
                shapesName += i + ") " + null + "\n";
            }
            i++;
        }
        return "There rest: \n" + shapesName + "Areas " +
                String.format("%.2f", shapesArea) + "\n" +
                "Perimeter " + String.format("%.2f", shapesPerimeter);
    }
}
