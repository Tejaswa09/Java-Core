package com.xworkz.polymorphism.sensor;

public class TemperatureSensor extends Sensor {
    @Override
    public void type() {
        System.out.println("Type: Temperature Sensor");
    }

    @Override
    public void functionality() {
        System.out.println("Functionality: Measures temperature in Celsius, Fahrenheit, or Kelvin");
    }

    @Override
    public void range() {
        System.out.println("Range: Typically from -50°C to 150°C (varies by model)");
    }

    @Override
    public void accuracy() {
        System.out.println("Accuracy: ±0.5°C to ±2°C (depends on the sensor model)");
    }

    @Override
    public void application() {
        System.out.println("Application: Used in climate control, medical devices, and industrial processes");
    }
}
