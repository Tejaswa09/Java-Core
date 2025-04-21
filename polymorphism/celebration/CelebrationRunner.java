package com.xworkz.polymorphism.celebration;

public class CelebrationRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Festival festival = new Festival();
        festival.name();
        festival.type();
        festival.location();
        festival.duration();
        festival.mainAttraction();
        System.out.println();

        System.out.println("Parent Details:");
        Celebration celebration = new Celebration();
        celebration.name();
        celebration.type();
        celebration.location();
        celebration.duration();
        celebration.mainAttraction();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Celebration festivalAsCelebration = new Festival();
        festivalAsCelebration.name();
        festivalAsCelebration.type();
        festivalAsCelebration.location();
        festivalAsCelebration.duration();
        festivalAsCelebration.mainAttraction();
    }
}
