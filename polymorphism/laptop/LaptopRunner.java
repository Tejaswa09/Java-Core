package com.xworkz.polymorphism.laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        HpVictus hpVictus = new HpVictus();
        hpVictus.brand();
        hpVictus.model();
        hpVictus.processor();
        hpVictus.ram();
        hpVictus.storage();
        hpVictus.price();
        System.out.println();

        System.out.println("Parent Details:");
        Laptop laptop = new Laptop();
        laptop.brand();
        laptop.model();
        laptop.processor();
        laptop.ram();
        laptop.storage();
        laptop.price();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Laptop hpVictusAsLaptop = new HpVictus();
        hpVictusAsLaptop.brand();
        hpVictusAsLaptop.model();
        hpVictusAsLaptop.processor();
        hpVictusAsLaptop.ram();
        hpVictusAsLaptop.storage();
        hpVictusAsLaptop.price();
    }
}
