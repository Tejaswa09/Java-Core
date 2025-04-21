package com.xworkz.polymorphism.cotton;

public class Blanket extends Cotton {
    @Override
    public void material() {
        System.out.println("Material: Cotton (Fleece)");
    }

    @Override
    public void usage() {
        System.out.println("Usage: Used as a bed covering for warmth");
    }

    @Override
    public void texture() {
        System.out.println("Texture: Soft and Fuzzy");
    }

    @Override
    public void weight() {
        System.out.println("Weight: Heavy (for warmth)");
    }

    @Override
    public void careInstructions() {
        System.out.println("Care Instructions: Machine wash on gentle cycle, tumble dry low");
    }
}
