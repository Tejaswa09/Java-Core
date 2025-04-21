package com.xworkz.polymorphism.engine;

public class EngineRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        DieselEngine diesel = new DieselEngine();
        diesel.engineType();
        diesel.fuelType();
        diesel.efficiency();
        diesel.maintenanceCost();
        diesel.powerOutput();
        System.out.println();

        System.out.println("Parent Details:");
        Engine engine = new Engine();
        engine.engineType();
        engine.fuelType();
        engine.efficiency();
        engine.maintenanceCost();
        engine.powerOutput();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Engine dieselAsEngine = new DieselEngine();
        dieselAsEngine.engineType();
        dieselAsEngine.fuelType();
        dieselAsEngine.efficiency();
        dieselAsEngine.maintenanceCost();
        dieselAsEngine.powerOutput();
    }
}
