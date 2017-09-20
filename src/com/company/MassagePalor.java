package com.company;

public class MassagePalor {
    int age;
    String service;
    String name;
    boolean SatisfiesEveryone;

    void sayHi() {
        System.out.println("Hi, we are " + name + " and we will satisfy your needs.");
    }

    int getAge() {
        return age;
    }

    void describe() {
        System.out.println("We are a Massage Parlor called " + name + ".");
        System.out.println("We have been open for " + age + " years.");
        if (SatisfiesEveryone) {
            System.out.println("You will enter a room and leave satisfied guaranteed.");
        } else {
            System.out.println("It will start rough, so not everyone will enjoy.");
        }
    }
}

