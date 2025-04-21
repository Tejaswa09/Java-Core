package com.xworkz.polymorphism.plant;

public class PlantRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Flower flower = new Flower();
        flower.type();
        flower.color();
        flower.growth();
        flower.habitat();
        flower.benefits();
        System.out.println();

        System.out.println("Parent Details:");
        Plant plant = new Plant();
        plant.type();
        plant.color();
        plant.growth();
        plant.habitat();
        plant.benefits();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Plant flowerAsPlant = new Flower();
        flowerAsPlant.type();
        flowerAsPlant.color();
        flowerAsPlant.growth();
        flowerAsPlant.habitat();
        flowerAsPlant.benefits();
    }
}
