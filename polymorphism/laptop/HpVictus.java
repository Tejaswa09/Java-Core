package com.xworkz.polymorphism.laptop;

public class HpVictus extends Laptop {
    @Override
    public void brand() {
        System.out.println("Brand: HP");
    }

    @Override
    public void model() {
        System.out.println("Model: Victus");
    }

    @Override
    public void processor() {
        System.out.println("Processor: Intel i7");
    }

    @Override
    public void ram() {
        System.out.println("RAM: 16GB");
    }

    @Override
    public void storage() {
        System.out.println("Storage: 1TB SSD");
    }

    @Override
    public void price() {
        System.out.println("Price: $999");
    }
}
