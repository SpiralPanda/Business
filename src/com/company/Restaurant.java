package com.company;

public class Restaurant {
    int age;
    int item;
    String name;
    boolean Affordablforeveryone;

    void sayHi() {System.out.println("Greetings, this is the White Night.");}

    int getAge() {return age;}

    void describe() {
        System.out.println("We are a Restaurant that is call White Night");
        System.out.println("White Night have been running for " + age + " years.");
        if (Affordablforeveryone) {
            System.out.println("It is affordable for everyone!");
        } else {
            System.out.println("Requires 2 weeks of reservations ahead of time");
        }

    }
}
