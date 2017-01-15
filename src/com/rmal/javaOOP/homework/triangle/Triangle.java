package com.rmal.javaOOP.homework.triangle;

/*Описать класс «Triangle». В качестве свойств возьмите длины сторон
        треугольника. Реализуйте метод, который будет возвращать площадь этого
        треугольника. Создайте несколько объектов этого класса и протестируйте их.*/

class Triangle {

    private double a;
    private double b;
    private double c;
    private double area;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        super();
    }

    public double getArea() {
        double p = (a + b + c) / 2;
        if ((p - a) < 0 || (p - b) < 0 || (p - c) < 0) {
            area = 0;
        } else {
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return area;
    }

    @Override
    public String toString() {
        if ((a + b) > c && area != 0) {
            return "Triangle{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c=" + c +
                    ", area=" + area +
                    '}';
        } else {
            return "Triangle not exist!!!";
        }
    }
}
