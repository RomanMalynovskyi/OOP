package com.rmal.javaOOP.homework.Board;

/*3.Создайте классы которые описывают как минимум 3
        геометрические фигуры (они должны быть подклассами
        Shape), при этом они в качестве свойств должны содержать
        классы Point.*/

class Rectangle extends Shape {

    private Point point = new Point();
    private Point pointOne = new Point(point.getX(), point.getY());
    private Point pointTwo = new Point(point.getX(), point.getY());
    private Point pointThree = new Point(point.getX(), point.getY());
    private Point pointFour = new Point(point.getX(), point.getY());

    public Rectangle(Point pointOne, Point pointTwo, Point pointThree, Point pointFour) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.pointThree = pointThree;
        this.pointFour = pointFour;
    }

    public Rectangle() {
        super();
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(pointTwo.getX() - pointOne.getX(), 2) + Math.pow(pointTwo.getY() - pointOne.getY(), 2)) +
                Math.sqrt(Math.pow(pointThree.getX() - pointTwo.getX(), 2) + Math.pow(pointThree.getY() - pointTwo.getY(), 2)) +
                Math.sqrt(Math.pow(pointFour.getX() - pointThree.getX(), 2) + Math.pow(pointFour.getY() - pointThree.getY(), 2)) +
                Math.sqrt(Math.pow(pointFour.getX() - pointOne.getX(), 2) + Math.pow(pointFour.getY() - pointOne.getY(), 2));

    }

    @Override
    public double getArea() {
        double a = Math.sqrt(Math.pow(pointTwo.getX() - pointOne.getX(), 2) + Math.pow(pointTwo.getY() - pointOne.getY(), 2));
        double b = Math.sqrt(Math.pow(pointThree.getX() - pointTwo.getX(), 2) + Math.pow(pointThree.getY() - pointTwo.getY(), 2));
        double c = Math.sqrt(Math.pow(pointFour.getX() - pointThree.getX(), 2) + Math.pow(pointFour.getY() - pointThree.getY(), 2));
        double d = Math.sqrt(Math.pow(pointFour.getX() - pointOne.getX(), 2) + Math.pow(pointFour.getY() - pointOne.getY(), 2));
        double p = (a + b + c + d) / 2;
        if ((p - a) <= 0 || (p - b) <= 0 || (p - c) <= 0 || (p - d) <= 0) {
            return 0;
        } else {
            return Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
        }
    }

    @Override
    public String toString() {
        if (getArea() != 0) {
            return "Rectangle{" +
                    "pointOne=" + pointOne +
                    ", pointTwo=" + pointTwo +
                    ", pointThree=" + pointThree +
                    ", pointFour=" + pointFour +
                    ", perimeter=" + getPerimeter() +
                    ", area=" + getArea() +
                    '}';
        } else {
            return "Rectangle not exist!";
        }
    }
}
