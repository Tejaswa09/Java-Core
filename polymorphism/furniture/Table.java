package com.xworkz.polymorphism.furniture;

public class Table extends Furniture {
    @Override
    public void material() {
        System.out.println("Material: Wood");
    }

    @Override
    public void purpose() {
        System.out.println("Purpose: To provide a flat surface for various activities");
    }

    @Override
    public void size() {
        System.out.println("Size: Typically 4 feet by 3 feet");
    }

    @Override
    public void color() {
        System.out.println("Color: Brown or natural wood color");
    }

    @Override
    public void price() {
        System.out.println("Price: Moderate to high, depending on material and design");
    }
}
