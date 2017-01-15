package com.rmal.javaOOP.homework.cat;

/*Описать класс «cat» (в качестве образца можно взять домашнего питомца).
        Наделить его свойствами и методами. Создать несколько экземпляров объектов этого
        класса. Использовать эти объекты.*/

public class CatRunner {

    public static void main(String[] args) {
        Cat catOne = new Cat("Leopold", "Siamese", "gray", "milk", 2);
        Cat catTwo = new Cat("Matroskin", "Persian", "white", "meat", 1);
        Cat catThree = new Cat("Murlo", "Siberian", "black", "meat and milk", 3);

        System.out.println(catOne);
        catOne.voice();
        catOne.move();

        System.out.println(catTwo);
        catTwo.voice();
        catTwo.sleep();

        System.out.println(catThree);
        catThree.eat();
        catThree.sleep();
    }
}
