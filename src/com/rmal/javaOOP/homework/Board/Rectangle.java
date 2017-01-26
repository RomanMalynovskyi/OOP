package com.rmal.javaOOP.homework.Board;

/*3.Создайте классы которые описывают как минимум 3
        геометрические фигуры (они должны быть подклассами
        Shape), при этом они в качестве свойств должны содержать
        классы Point.*/

class Rectangle extends Shape {

    private Point pointOne;
    private Point pointTwo;
    private Point pointThree;
    private Point pointFour;

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
        return pointOne.getDistance(pointTwo) + pointTwo.getDistance(pointThree) +
                pointThree.getDistance(pointFour) + pointFour.getDistance(pointOne);

    }

    @Override
    public double getArea() {
        double a = pointOne.getDistance(pointTwo);
        double b = pointTwo.getDistance(pointThree);
        double c = pointThree.getDistance(pointFour);
        double d = pointFour.getDistance(pointOne);
        double p = (a + b + c + d) / 2;
        if ((p - a) <= 0 || (p - b) <= 0 || (p - c) <= 0 || (p - d) <= 0) {
            return 0;
        } else {
            return Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        if (this.pointOne.getX() != rectangle.pointOne.getX() || this.pointOne.getY() != rectangle.pointOne.getY())
            return false;
        if (this.pointTwo.getX() != rectangle.pointTwo.getX() || this.pointTwo.getY() != rectangle.pointTwo.getY())
            return false;
        if (this.pointThree.getX() != rectangle.pointThree.getX() || this.pointThree.getY() != rectangle.pointThree.getY())
            return false;
        return (this.pointFour.getX() == rectangle.pointFour.getX() && this.pointFour.getY() == rectangle.pointFour.getY());
    }

    @Override
    public int hashCode() {
        int result = pointOne.hashCode();
        result = 31 * result + pointTwo.hashCode();
        result = 31 * result + pointThree.hashCode();
        result = 31 * result + pointFour.hashCode();
        return result;
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
