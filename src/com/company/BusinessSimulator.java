package com.company;

public class BusinessSimulator {

    public static void main(String[] args) {
        MassagePalor Haru = new MassagePalor();
        Haru.age = 21;
        Haru.name = "Haru Haru(Day by Day)";
        Haru.service = "We are a Massage Parlor that satisfies your needs";
        Haru.SatisfiesEveryone = true;

        Restaurant WN = new Restaurant();
        WN.age = 20;
        WN.name = "White Night";
        WN.Affordablforeveryone = false;

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
