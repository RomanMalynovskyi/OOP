package com.rmal.javaOOP.homework.phone;

/*Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
        класс Network (сеть мобильного оператора). Телефон должен иметь метод
        регистрации в сети мобильного оператора. Также у телефона должен быть метод call
        (номер другого телефона), который переберет все телефоны, зарегистрированные в
        сети. Если такой номер найден, то осуществить вызов, если нет - вывести сообщение
        о неправильности набранного номера.*/

class Phone {

    private String model;
    private String phoneNumber;
    private boolean isInNetwork;

    public Phone(String model, String phoneNumber) {
        this.model = model;
        this.phoneNumber = phoneNumber;
    }

    public Phone() {
        super();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isInNetwork() {
        return isInNetwork;
    }

    public void setInNetwork(boolean inNetwork) {
        isInNetwork = inNetwork;
    }

    public void regInNetwork(Network network) {
        if (network.getRegisteredNumbers().contains(this.phoneNumber)) {
            System.out.println("Number " + getPhoneNumber() + " already registered in network " + network.getName());
        } else {
            network.getRegisteredNumbers().add(this.phoneNumber);
            System.out.println(this.phoneNumber + " is registered in network " + network);
            isInNetwork = true;
        }
    }

    public void outcomingCall(Phone phone, Network network) {
        if (network.getRegisteredNumbers().contains(phone.getPhoneNumber())) {
            phone.incomingCall(this);
        } else {
            System.out.println(phone.getPhoneNumber() + " not registered in network!");
        }
    }

    public void incomingCall(Phone caller) {
        System.out.println(this + " you have incoming call from " + caller.toString());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isInNetwork=" + isInNetwork +
                '}';
    }
}
