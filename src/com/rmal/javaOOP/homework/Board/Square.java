package com.rmal.javaOOP.homework.Board;

/*3.Создайте классы которые описывают как минимум 3
        геометрические фигуры (они должны быть подклассами
        Shape), при этом они в качестве свойств должны содержать
        классы Point.*/

class Square extends Shape {

    private Point pointOne;
    private Point pointTwo;
    private Point pointThree;
    private Point pointFour;

    public Square(Point pointOne, Point pointTwo, Point pointThree, Point pointFour) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.pointThree = pointThree;
        this.pointFour = pointFour;
    }

    public Square() {
        super();
    }

    @Override
    public double getPerimeter() {
        return 4 * (pointOne.getDistance(pointTwo));
    }

    @Override
    public double getArea() {
        double a = pointOne.getDistance(pointTwo);
        double b = pointTwo.getDistance(pointThree);
        double c = pointThree.getDistance(pointFour);
        double d = pointFour.getDistance(pointOne);
        if (a == b && b == c && c == d && d == a) {
            return Math.pow(a, 2);
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        if (this.pointOne.getX() != square.pointOne.getX() || this.pointOne.getY() != square.pointOne.getY())
            return false;
        if (this.pointTwo.getX() != square.pointTwo.getX() || this.pointTwo.getY() != square.pointTwo.getY())
            return false;
        if (this.pointThree.getX() != square.pointThree.getX() || this.pointThree.getY() != square.pointThree.getY())
            return false;
        return (this.pointFour.getX() == square.pointFour.getX() && this.pointFour.getY() == square.pointFour.getY());
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
            return "Square{" +
                    "pointOne=" + pointOne +
                    ", pointTwo=" + pointTwo +
                    ", pointThree=" + pointThree +
                    ", pointFour=" + pointFour +
                    ", perimeter=" + getPerimeter() +
                    ", area=" + getArea() +
                    '}';
        } else {
            return "Square not exist!";
        }
    }
}


