package com.xworkz.polymorphism.furniture;

public class FurnitureRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Table table = new Table();
        table.material();
        table.purpose();
        table.size();
        table.color();
        table.price();
        System.out.println();

        System.out.println("Parent Details:");
        Furniture furniture = new Furniture();
        furniture.material();
        furniture.purpose();
        furniture.size();
        furniture.color();
        furniture.price();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Furniture tableAsFurniture = new Table();
        tableAsFurniture.material();
        tableAsFurniture.purpose();
        tableAsFurniture.size();
        tableAsFurniture.color();
        tableAsFurniture.price();
    }
}
