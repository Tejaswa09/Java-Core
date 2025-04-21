package com.xworkz.polymorphism.sensor;

public class SensorRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        TemperatureSensor tempSensor = new TemperatureSensor();
        tempSensor.type();
        tempSensor.functionality();
        tempSensor.range();
        tempSensor.accuracy();
        tempSensor.application();
        System.out.println();

        System.out.println("Parent Details:");
        Sensor sensor = new Sensor();
        sensor.type();
        sensor.functionality();
        sensor.range();
        sensor.accuracy();
        sensor.application();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Sensor tempSensorAsSensor = new TemperatureSensor();
        tempSensorAsSensor.type();
        tempSensorAsSensor.functionality();
        tempSensorAsSensor.range();
        tempSensorAsSensor.accuracy();
        tempSensorAsSensor.application();
    }
}
