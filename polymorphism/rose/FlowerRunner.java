package com.xworkz.polymorphism.rose;

public class FlowerRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Rose rose = new Rose();
        rose.type();
        rose.color();
        rose.fragrance();
        rose.season();
        rose.uses();
        System.out.println();

        System.out.println("Parent Details:");
        Flower flower = new Flower();
        flower.type();
        flower.color();
        flower.fragrance();
        flower.season();
        flower.uses();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Flower roseAsFlower = new Rose();
        roseAsFlower.type();
        roseAsFlower.color();
        roseAsFlower.fragrance();
        roseAsFlower.season();
        roseAsFlower.uses();
    }
}
