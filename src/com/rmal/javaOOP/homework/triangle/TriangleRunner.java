package com.rmal.javaOOP.homework.triangle;

/*Описать класс «Triangle». В качестве свойств возьмите длины сторон
        треугольника. Реализуйте метод, который будет возвращать площадь этого
        треугольника. Создайте несколько объектов этого класса и протестируйте их.*/

public class TriangleRunner {

    public static void main(String[] args) {
        Triangle triangleOne = new Triangle(2, 4, 3);
        Triangle triangleTwo = new Triangle(5, 6, 2);
        Triangle triangleThree = new Triangle(5, 3, 4);

        triangleOne.getArea();
        triangleTwo.getArea();
        triangleThree.getArea();

        System.out.println(triangleOne);
        System.out.println(triangleTwo);
        System.out.println(triangleThree);
    }
}
