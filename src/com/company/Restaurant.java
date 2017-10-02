package com.company;

public class Restaurant extends Business {
    boolean Affordableforeveryone;

    Restaurant(int myAge, String myName, boolean A) {
        super(myAge, myName);
        Affordableforeveryone = A;
    }
    void describe() {
        System.out.println("We are a Restaurant that is called " + getName() );
        System.out.println("White Night have been running for " + getAge() + " years.");
        if (Affordableforeveryone) {
            System.out.println("It is affordable for everyone!");
        } else {
            System.out.println("Requires 2 weeks of reservations ahead of time");
        }

    }
}
