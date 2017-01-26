package com.rmal.javaOOP.homework.Board;

/*3.Создайте классы которые описывают как минимум 3
        геометрические фигуры (они должны быть подклассами
        Shape), при этом они в качестве свойств должны содержать
        классы Point.*/

class Triangle extends Shape {

    private Point pointOne;
    private Point pointTwo;
    private Point pointThree;

    public Triangle(Point pointOne, Point pointTwo, Point pointThree) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.pointThree = pointThree;
    }

    public Triangle() {
        super();
    }

    @Override
    public double getPerimeter() {
        return pointOne.getDistance(pointTwo) + pointTwo.getDistance(pointThree) +
                pointThree.getDistance(pointOne);
    }

    @Override
    public double getArea() {
        double a = pointOne.getDistance(pointTwo);
        double b = pointTwo.getDistance(pointThree);
        double c = pointThree.getDistance(pointOne);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        if (this.pointOne.getX() != triangle.pointOne.getX() || this.pointOne.getY() != triangle.pointOne.getY())
            return false;
        if (this.pointTwo.getX() != triangle.pointTwo.getX() || this.pointTwo.getY() != triangle.pointTwo.getY())
            return false;
        return (this.pointThree.getX() == triangle.pointThree.getX() && this.pointThree.getY() == triangle.pointThree.getY());
    }

    @Override
    public int hashCode() {
        int result = pointOne.hashCode();
        result = 31 * result + pointTwo.hashCode();
        result = 31 * result + pointThree.hashCode();
        return result;
    }

    @Override
    public String toString() {
        if (getArea() != 0) {
            return "Triangle{" +
                    "pointOne=" + pointOne +
                    ", pointTwo=" + pointTwo +
                    ", pointThree=" + pointThree +
                    ", perimeter=" + getPerimeter() +
                    ", area=" + getArea() +
                    '}';
        } else {
            return "Triangle not exist!";
        }
    }
}

