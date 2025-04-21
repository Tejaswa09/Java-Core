package com.xworkz.polymorphism.transport;

public class Train extends Transport {
    @Override
    public void type() {
        System.out.println("Type: Train");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel Type: Diesel or Electric.");
    }

    @Override
    public void capacity() {
        System.out.println("Capacity: Can carry hundreds to thousands of passengers.");
    }

    @Override
    public void speed() {
        System.out.println("Speed: Typically ranges from 80 km/h to 300 km/h.");
    }

    @Override
    public void usage() {
        System.out.println("Usage: Used for long-distance and local transportation of passengers and goods.");
    }
}
