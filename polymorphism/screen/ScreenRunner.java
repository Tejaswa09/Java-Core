package com.xworkz.polymorphism.screen;

public class ScreenRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        LEDScreen ledScreen = new LEDScreen();
        ledScreen.type();
        ledScreen.size();
        ledScreen.resolution();
        ledScreen.displayTechnology();
        ledScreen.powerConsumption();
        System.out.println();

        System.out.println("Parent Details:");
        Screen screen = new Screen();
        screen.type();
        screen.size();
        screen.resolution();
        screen.displayTechnology();
        screen.powerConsumption();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Screen ledScreenAsScreen = new LEDScreen();
        ledScreenAsScreen.type();
        ledScreenAsScreen.size();
        ledScreenAsScreen.resolution();
        ledScreenAsScreen.displayTechnology();
        ledScreenAsScreen.powerConsumption();
    }
}
