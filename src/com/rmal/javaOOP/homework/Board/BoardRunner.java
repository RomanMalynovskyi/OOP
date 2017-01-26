package com.rmal.javaOOP.homework.Board;

public class BoardRunner {

    public static void main(String[] args) {

        //Create board
        Board board = new Board();

        // Create points
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 7);
        Point point3 = new Point(5, 7);
        Point point4 = new Point(5, 0);
        Point point5 = new Point(7, 0);
        Point point6 = new Point(7, 7);

        //Create shapes
        Rectangle rectangle1 = new Rectangle(point1, point2, point3, point4);
        Triangle triangle1 = new Triangle(point6, point1, point2);
        Square square1 = new Square(point1, point2, point6, point5);

        //Add elements
        board.addShapeToBoard(rectangle1);
        board.addShapeToBoard(triangle1);
        board.addShapeToBoard(square1);
        board.addShapeToBoard(square1);

        // Show the board state
        System.out.println(board);

        //Remove element
        board.removeShapeFromBoard(square1);
        board.removeShapeFromBoard(rectangle1);
        board.removeShapeFromBoard(square1);
        // Show the board state
        System.out.println(board);
    }
}
