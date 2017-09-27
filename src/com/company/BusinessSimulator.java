package com.company;

public class BusinessSimulator {

    public static void main(String[] args) {
        MassagePalor Haru = new MassagePalor(21, " Haru Haru ", true);
        Restaurant WN = new Restaurant(20, " White Night ", false);

        System.out.println();
        System.out.println("Introduce yourselves.");
        System.out.println();
        Haru.sayHi();
        System.out.println();
        WN.sayHi();
        System.out.println();

        System.out.println("Now what do you do?");
        System.out.println();
        Haru.describe();
        System.out.println();
        WN.describe();
        System.out.println();


        int totalage = Haru.getAge() * WN.getAge();
        System.out.println("If you multiply our years together, our Businesses has been running for " + totalage + " years");
    }
}
