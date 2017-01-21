package com.rmal.javaOOP.homework.Board;

/*4.Создайте класс доска. Доска поделена на 4 части в каждую
    часть доски можно положить одну из фигур. У доски должны
    быть методы которые помещают и удаляют фигуру с доски.
    Также должен быть метод который выводит информацию о
    всех фигурах лежащих на доске и их суммарную площадь.*/

import java.util.ArrayList;

class Board {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public Board(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public Board() {
        super();
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void addShapeToBoard(Shape shape) {
        if (shapes.size() != 4 && shape.getArea() != 0) {
            shapes.add(shape);
            System.out.println(shape.toString() + " has been added to the board!");
            System.out.println();
        } else if (shapes.size() == 4) {
            System.out.println("Board is occupied!!! Please, remove some elements! ");
        } else {
            System.out.println(shape.toString());
        }
    }

    public void removeShapeFromBoard(Shape shape) {
        for (Shape elem : shapes) {
            if (shapes.contains(shape)) {
                shapes.remove(shape);
                break;
            }
        }
        System.out.println(shape.toString() + " has been removed!");
        System.out.println();
    }

    public double getSumArea(ArrayList<Shape> shapes) {
        double sumArea = 0.0;
        for (Shape elem : shapes) {
            sumArea += elem.getArea();
        }
        return sumArea;
    }

    @Override
    public String toString() {
        return "Shapes on the board:  {"
                + shapes +
                ", Sum area of shapes=" + getSumArea(shapes) +
                '}';
    }
}

