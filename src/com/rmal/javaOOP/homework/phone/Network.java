package com.rmal.javaOOP.homework.phone;

/*Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
        класс Network (сеть мобильного оператора). Телефон должен иметь метод
        регистрации в сети мобильного оператора. Также у телефона должен быть метод call
        (номер другого телефона), который переберет все телефоны, зарегистрированные в
        сети. Если такой номер найден, то осуществить вызов, если нет - вывести сообщение
        о неправильности набранного номера.*/

import java.util.ArrayList;

class Network {

    private String name;
    private ArrayList<String> registeredNumbers = new ArrayList<>();

    public Network(String name) {
        this.name = name;
    }

    public Network() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getRegisteredNumbers() {
        return registeredNumbers;
    }

    public void setRegisteredNumbers(ArrayList<String> registeredNumbers) {
        this.registeredNumbers = registeredNumbers;
    }

    @Override
    public String toString() {
        return "Network{" +
                "name='" + name + '\'' +
                ", registeredNumbers=" + registeredNumbers +
                '}';
    }
}
