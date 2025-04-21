package com.xworkz.polymorphism.beverage;

public class Coffee extends Beverage {
    @Override
    public void company() {
        System.out.println("Company: Coffee Day");
    }

    @Override
    public void type() {
        System.out.println("Type: Hot Beverage");
    }

    @Override
    public void storageTemp() {
        System.out.println("Storage Temperature: Room Temperature");
    }

    @Override
    public void selfLife() {
        System.out.println("Shelf Life: 1 day");
    }

    @Override
    public void sugarPercentage() {
        System.out.println("Sugar Percentage: 2%");
    }
}
