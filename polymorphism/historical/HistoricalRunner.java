package com.xworkz.polymorphism.historical;

public class HistoricalRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Temple temple = new Temple();
        temple.name();
        temple.location();
        temple.builtYear();
        temple.importance();
        temple.visitorCount();
        System.out.println();

        System.out.println("Parent Details:");
        Historical historical = new Historical();
        historical.name();
        historical.location();
        historical.builtYear();
        historical.importance();
        historical.visitorCount();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Historical templeAsHistorical = new Temple();
        templeAsHistorical.name();
        templeAsHistorical.location();
        templeAsHistorical.builtYear();
        templeAsHistorical.importance();
        templeAsHistorical.visitorCount();
    }
}
