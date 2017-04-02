package com.bogdan.education.progOOP.inheritanceHomeWork;

/**
 * Created by Admin on 30.03.17.
 */
public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(2.3, 2.2, 3.4, 3, 5, 1);
        Shape rectangle = new Rectangle(0, -2, 1.7, -3, 3, -1, 2, 0);
        Shape square = new Square(-1, -1, -3, -1, -3.6, -3, -1, -3);
        Shape triangle1 = new Triangle(-1, 1, -2.9, 4, -3, 2);
        Board board = new Board();
        board.addFigure(triangle1, 1);
        board.addFigure(triangle, 2);
        board.addFigure(rectangle, 1);
        board.addFigure(square, 4);
        board.deleteFigure(2);
        System.out.println(board.getInfo());

    }
}

