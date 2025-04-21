package com.xworkz.polymorphism.server;

public class DatabaseServer extends Server {
    @Override
    public void type() {
        System.out.println("Type: Database Server");
    }

    @Override
    public void functionality() {
        System.out.println("Functionality: Stores, manages, and serves database queries.");
    }

    @Override
    public void capacity() {
        System.out.println("Capacity: Can store terabytes of data depending on the system configuration.");
    }

    @Override
    public void security() {
        System.out.println("Security: Implements encryption, user authentication, and data access control for security.");
    }

    @Override
    public void usage() {
        System.out.println("Usage: Used to manage large amounts of data, support web applications, and ensure data integrity.");
    }
}
