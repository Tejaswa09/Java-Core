package com.xworkz.polymorphism.transport;

public class TransportRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Train train = new Train();
        train.type();
        train.fuelType();
        train.capacity();
        train.speed();
        train.usage();
        System.out.println();

        System.out.println("Parent Details:");
        Transport transport = new Transport();
        transport.type();
        transport.fuelType();
        transport.capacity();
        transport.speed();
        transport.usage();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Transport trainAsTransport = new Train();
        trainAsTransport.type();
        trainAsTransport.fuelType();
        trainAsTransport.capacity();
        trainAsTransport.speed();
        trainAsTransport.usage();
    }
}
