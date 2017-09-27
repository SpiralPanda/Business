package com.company;

public class Restaurant extends Business {
    boolean Affordablforeveryone;

    Restaurant(int myAge, String myName, boolean Affordableforeveryone) {
        super(myAge, myName, Affordableforeveryone);
    }
    void describe() {
        System.out.println("We are a Restaurant that is called " + getName() );
        System.out.println("White Night have been running for " + getAge() + " years.");
        if (Affordablforeveryone) {
            System.out.println("It is affordable for everyone!");
        } else {
            System.out.println("Requires 2 weeks of reservations ahead of time");
        }

    }
}
