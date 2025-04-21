package com.xworkz.polymorphism.guide;

public class Recipe extends Guide {
    @Override
    public void title() {
        System.out.println("Title: Chocolate Cake Recipe");
    }

    @Override
    public void steps() {
        System.out.println("Steps: Mix, bake, and decorate");
    }

    @Override
    public void purpose() {
        System.out.println("Purpose: To cook a delicious dish");
    }

    @Override
    public void toolsRequired() {
        System.out.println("Tools Required: Oven, mixing bowl, spatula");
    }

    @Override
    public void duration() {
        System.out.println("Duration: 1 hour");
    }
}
