package com.xworkz.polymorphism.soap;

public class MysoreSandle extends Soap {
    @Override
    public void type() {
        System.out.println("Type: Mysore Sandal Soap");
    }

    @Override
    public void fragrance() {
        System.out.println("Fragrance: Sandalwood, distinct and aromatic.");
    }

    @Override
    public void usage() {
        System.out.println("Usage: Used for bathing, leaves the skin soft and fragrant.");
    }

    @Override
    public void ingredients() {
        System.out.println("Ingredients: Sandalwood extract, natural oils, and soap base.");
    }

    @Override
    public void packaging() {
        System.out.println("Packaging: Packaged in eco-friendly wrappers.");
    }
}
