package com.xworkz.polymorphism.surface;

public class Touchscreen extends Surface {
    @Override
    public void type() {
        System.out.println("Type: Touchscreen Surface");
    }

    @Override
    public void material() {
        System.out.println("Material: Typically made from glass, plastic, or synthetic materials.");
    }

    @Override
    public void functionality() {
        System.out.println("Functionality: Allows user interaction through touch inputs.");
    }

    @Override
    public void durability() {
        System.out.println("Durability: Glass surface can be prone to scratching but is durable with protective coatings.");
    }

    @Override
    public void usage() {
        System.out.println("Usage: Used in smartphones, tablets, laptops, and other touch-enabled devices.");
    }
}
