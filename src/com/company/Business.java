package com.company;

public class Business {
    private int myAge;
    private String myName;

    Business(int age, String name) {
        myAge = age;
        myName = name;
    }

    Business(int age) {
        myAge = age;
    }
    //Business(int myAge, String name) {
        //myName = name;
    //}

    int getAge() {
        return myAge;
    }

    String getName() {
        return myName;
    }

    void sayHi() {
        if (myName == null) {
            System.out.println("[GENERIC] Greetings, what is our business called?");
        } else {
            System.out.println("[GENERIC] Greetings we are" + myName);
        }

    }

        void describe() {
            System.out.println("[GENERIC] Hello, we are a business.");
            System.out.println("[GENERIC] We're have also been running for " + myAge + " years.");
        }

}

