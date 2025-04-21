package com.xworkz.polymorphism.beverage;

public class BeverageRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Coffee coffee = new Coffee();
        coffee.company();
        coffee.type();
        coffee.storageTemp();
        coffee.selfLife();
        coffee.sugarPercentage();
        System.out.println();

        System.out.println("Parent Details:");
        Beverage beverage = new Beverage();
        beverage.company();
        beverage.type();
        beverage.storageTemp();
        beverage.selfLife();
        beverage.sugarPercentage();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Beverage coffeeAsBeverage = new Coffee();
        coffeeAsBeverage.company();
        coffeeAsBeverage.type();
        coffeeAsBeverage.storageTemp();
        coffeeAsBeverage.selfLife();
        coffeeAsBeverage.sugarPercentage();
    }
}
