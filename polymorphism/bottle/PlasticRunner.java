package com.xworkz.polymorphism.bottle;

public class PlasticRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Bottle bottle = new Bottle();
        bottle.type();
        bottle.usage();
        bottle.recyclable();
        bottle.meltingPoint();
        bottle.color();
        System.out.println();

        System.out.println("Parent Details:");
        Plastic plastic = new Plastic();
        plastic.type();
        plastic.usage();
        plastic.recyclable();
        plastic.meltingPoint();
        plastic.color();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Plastic bottleAsPlastic = new Bottle();
        bottleAsPlastic.type();
        bottleAsPlastic.usage();
        bottleAsPlastic.recyclable();
        bottleAsPlastic.meltingPoint();
        bottleAsPlastic.color();
    }
}
