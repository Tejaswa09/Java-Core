package com.xworkz.polymorphism.building;

public class Apartment extends Building {
    @Override
    public void name() {
        System.out.println("Sunshine Apartments");
    }

    @Override
    public void floors() {
        System.out.println("Floors: 10");
    }

    @Override
    public void material() {
        System.out.println("Material: Reinforced Concrete");
    }

    @Override
    public void hasLift() {
        System.out.println("Lift available: Yes");
    }

    @Override
    public void parkingAvailable() {
        System.out.println("Parking: Basement and Open area");
    }
}
