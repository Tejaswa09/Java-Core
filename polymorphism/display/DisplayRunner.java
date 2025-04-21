package com.xworkz.polymorphism.display;

public class DisplayRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        OLED oled = new OLED();
        oled.type();
        oled.resolution();
        oled.powerConsumption();
        oled.contrastRatio();
        oled.flexibility();
        System.out.println();

        System.out.println("Parent Details:");
        Display display = new Display();
        display.type();
        display.resolution();
        display.powerConsumption();
        display.contrastRatio();
        display.flexibility();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Display oledAsDisplay = new OLED();
        oledAsDisplay.type();
        oledAsDisplay.resolution();
        oledAsDisplay.powerConsumption();
        oledAsDisplay.contrastRatio();
        oledAsDisplay.flexibility();
    }
}
