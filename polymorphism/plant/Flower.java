package com.xworkz.polymorphism.plant;

public class Flower extends Plant {
    @Override
    public void type() {
        System.out.println("Type: Flowering Plant");
    }

    @Override
    public void color() {
        System.out.println("Color: Various colors (red, yellow, white, etc.)");
    }

    @Override
    public void growth() {
        System.out.println("Growth: Blooms seasonally depending on species");
    }

    @Override
    public void habitat() {
        System.out.println("Habitat: Commonly found in gardens and fields");
    }

    @Override
    public void benefits() {
        System.out.println("Benefits: Provides beauty, attracts pollinators, some are edible");
    }
}
