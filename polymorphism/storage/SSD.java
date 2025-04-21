package com.xworkz.polymorphism.storage;

public class SSD extends Storage {
    @Override
    public void type() {
        System.out.println("Type: Solid State Drive (SSD)");
    }

    @Override
    public void capacity() {
        System.out.println("Capacity: Typically ranges from 120GB to 4TB.");
    }

    @Override
    public void speed() {
        System.out.println("Speed: Very fast (reads and writes in hundreds of MB/s).");
    }

    @Override
    public void durability() {
        System.out.println("Durability: High durability with no moving parts.");
    }

    @Override
    public void usage() {
        System.out.println("Usage: Used in computers, laptops, and gaming consoles for fast data access.");
    }
}
