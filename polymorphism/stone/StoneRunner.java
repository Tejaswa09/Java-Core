package com.xworkz.polymorphism.stone;

public class StoneRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Granite granite = new Granite();
        granite.type();
        granite.composition();
        granite.color();
        granite.hardness();
        granite.uses();
        System.out.println();

        System.out.println("Parent Details:");
        Stone stone = new Stone();
        stone.type();
        stone.composition();
        stone.color();
        stone.hardness();
        stone.uses();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Stone graniteAsStone = new Granite();
        graniteAsStone.type();
        graniteAsStone.composition();
        graniteAsStone.color();
        graniteAsStone.hardness();
        graniteAsStone.uses();
    }
}
