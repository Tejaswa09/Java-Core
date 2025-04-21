package com.xworkz.polymorphism.building;

public class Building {
    public void name() {
        System.out.println("Generic Building");
    }

    public void floors() {
        System.out.println("Floors: 1");
    }

    public void material() {
        System.out.println("Material: Concrete");
    }

    public void hasLift() {
        System.out.println("Lift available: No");
    }

    public void parkingAvailable() {
        System.out.println("Parking: Not available");
    }
}
