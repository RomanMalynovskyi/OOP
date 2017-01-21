package com.rmal.javaOOP.homework.Board;

/*3.Создайте классы которые описывают как минимум 3
        геометрические фигуры (они должны быть подклассами
        Shape), при этом они в качестве свойств должны содержать
        классы Point.*/

class Triangle extends Shape {

        private Point point = new Point();
        private Point pointOne = new Point(point.getX(), point.getY());
        private Point pointTwo = new Point(point.getX(), point.getY());
        private Point pointThree = new Point(point.getX(), point.getY());

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
            if ((p - a) <= 0 || (p - b) <= 0 || (p - c) <= 0 || (a + b) < c) {
                return 0;
            } else {
                return Math.sqrt(p * (p - a) * (p - b) * (p - c));
            }
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

