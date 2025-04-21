package com.xworkz.polymorphism.material;

public class MaterialRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Metal metal = new Metal();
        metal.type();
        metal.hardness();
        metal.use();
        metal.durability();
        metal.price();
        System.out.println();

        System.out.println("Parent Details:");
        Material material = new Material();
        material.type();
        material.hardness();
        material.use();
        material.durability();
        material.price();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Material metalAsMaterial = new Metal();
        metalAsMaterial.type();
        metalAsMaterial.hardness();
        metalAsMaterial.use();
        metalAsMaterial.durability();
        metalAsMaterial.price();
    }
}
