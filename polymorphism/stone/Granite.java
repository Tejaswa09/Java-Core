package com.xworkz.polymorphism.stone;

public class    Granite extends Stone {
    @Override
    public void type() {
        System.out.println("Type: Granite Stone");
    }

    @Override
    public void composition() {
        System.out.println("Composition: Mainly composed of quartz, feldspar, and mica.");
    }

    @Override
    public void color() {
        System.out.println("Color: Usually light-colored (white, pink, or gray) with specks.");
    }

    @Override
    public void hardness() {
        System.out.println("Hardness: Very hard (6 to 7 on the Mohs scale).");
    }

    @Override
    public void uses() {
        System.out.println("Uses: Used for countertops, flooring, monuments, and building facades.");
    }
}
