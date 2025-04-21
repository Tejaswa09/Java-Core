package com.xworkz.polymorphism.celebration;

public class Festival extends Celebration {
    @Override
    public void name() {
        System.out.println("Diwali");
    }

    @Override
    public void type() {
        System.out.println("Type: Cultural/Religious");
    }

    @Override
    public void location() {
        System.out.println("Location: Celebrated across India");
    }

    @Override
    public void duration() {
        System.out.println("Duration: 5 days");
    }

    @Override
    public void mainAttraction() {
        System.out.println("Main Attraction: Fireworks, lights, sweets");
    }
}
