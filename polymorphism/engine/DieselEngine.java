package com.xworkz.polymorphism.engine;

public class DieselEngine extends Engine {
    @Override
    public void engineType() {
        System.out.println("Engine Type: Diesel Engine");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel Type: Diesel");
    }

    @Override
    public void efficiency() {
        System.out.println("Efficiency: High fuel efficiency");
    }

    @Override
    public void maintenanceCost() {
        System.out.println("Maintenance Cost: Higher compared to petrol engines");
    }

    @Override
    public void powerOutput() {
        System.out.println("Power Output: High torque output");
    }
}
