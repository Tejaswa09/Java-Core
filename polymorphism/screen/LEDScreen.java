package com.xworkz.polymorphism.screen;

public class LEDScreen extends Screen {
    @Override
    public void type() {
        System.out.println("Type: LED Screen");
    }

    @Override
    public void size() {
        System.out.println("Size: Typically 32 to 75 inches");
    }

    @Override
    public void resolution() {
        System.out.println("Resolution: Full HD, 4K, 8K");
    }

    @Override
    public void displayTechnology() {
        System.out.println("Display Technology: LED (Light Emitting Diode) Backlit");
    }

    @Override
    public void powerConsumption() {
        System.out.println("Power Consumption: Low (compared to older display technologies)");
    }
}
