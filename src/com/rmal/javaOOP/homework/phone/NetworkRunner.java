package com.rmal.javaOOP.homework.phone;

/*Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
        класс Network (сеть мобильного оператора). Телефон должен иметь метод
        регистрации в сети мобильного оператора. Также у телефона должен быть метод call
        (номер другого телефона), который переберет все телефоны, зарегистрированные в
        сети. Если такой номер найден, то осуществить вызов, если нет - вывести сообщение
        о неправильности набранного номера.*/

public class NetworkRunner {

    public static void main(String[] args) {
        Network network = new Network("MTC");
        Phone phoneOne = new Phone("Samsung A5", "+380505555555");
        Phone phoneTwo = new Phone("IPhone 5S", "+380507777777");
        Phone phoneThree = new Phone("Lenovo", "+380953333333");
        Phone phoneFour = new Phone("Nokia", "+380950000000");

        System.out.println(phoneOne);
        System.out.println(phoneTwo);
        System.out.println(phoneThree);
        System.out.println(phoneFour);
        System.out.println();

        phoneOne.regInNetwork(network);
        phoneTwo.regInNetwork(network);
        phoneThree.regInNetwork(network);
        System.out.println();

        phoneOne.outcomingCall(phoneTwo, network);
        phoneTwo.outcomingCall(phoneOne, network);
        phoneTwo.outcomingCall(phoneThree, network);
        phoneThree.outcomingCall(phoneFour, network);
    }
}
