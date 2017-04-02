package com.bogdan.education.progOOP.inheritanceHomeWork;

/**
 * Created by Admin on 30.03.17.
 */
public class Board {
    private Shape[] blackboard = new Shape[4];

    public void addFigure(Shape shape, int i) {
        if (blackboard[i-1] == null) {
            blackboard[i-1] = shape;
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

    public String getInfo() {
        String shapesName = "";
        double shapesArea = 0;
        for (Shape part : blackboard) {
            if (part != null) {
                String[] allName =part.getClass().getName().split("\\.");
                shapesName += allName[5] + " , ";
                shapesArea += part.getArea();
            }
        }
        return "There rest: " + shapesName + " areas " + String.format("%.2f", shapesArea);
    }
}
