package com.company;

public class MassagePalor extends Business {
    boolean SatisfiesEveryone;

    MassagePalor(int myAge, String myName, boolean S) {
        super(myAge, myName);
        SatisfiesEveryone = S;
    }

    void describe() {
        System.out.println("We are a Massage Parlor called " + getName() + ".");
        System.out.println("We have been open for " + getAge() + " years.");
        if (SatisfiesEveryone) {
            System.out.println("You will enter a room and leave satisfied guaranteed.");
        } else {
            System.out.println("It will start rough, so not everyone will enjoy.");
        }
    }
}

