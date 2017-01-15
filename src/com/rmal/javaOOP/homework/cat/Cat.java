package com.rmal.javaOOP.homework.cat;

/*Описать класс «cat» (в качестве образца можно взять домашнего питомца).
        Наделить его свойствами и методами. Создать несколько экземпляров объектов этого
        класса. Использовать эти объекты.*/

class Cat {

    private String name;
    private String breed;
    private String color;
    private String ration;
    private int age;

    public Cat(String name, String breed, String color, String ration, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.ration = ration;
        this.age = age;
    }

    public Cat() {
        super();
    }

    public void voice() {
        System.out.println(name + " May-may!!! ");
    }

    public void move() {
        System.out.println(name + " is moving ");
    }

    public void eat() {
        System.out.println(name + " is eating " + ration);
    }

    public void sleep() {
        System.out.println(name + " z-z-z-z-z-z-z... ");
    }

    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", ration='" + ration + '\'' +
                ", age=" + age +
                '}';
    }
}
