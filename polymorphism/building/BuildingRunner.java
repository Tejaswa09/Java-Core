package com.xworkz.polymorphism.building;

public class BuildingRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Apartment apartment = new Apartment();
        apartment.name();
        apartment.floors();
        apartment.material();
        apartment.hasLift();
        apartment.parkingAvailable();
        System.out.println();

        System.out.println("Parent Details:");
        Building building = new Building();
        building.name();
        building.floors();
        building.material();
        building.hasLift();
        building.parkingAvailable();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Building apartmentAsBuilding = new Apartment();
        apartmentAsBuilding.name();
        apartmentAsBuilding.floors();
        apartmentAsBuilding.material();
        apartmentAsBuilding.hasLift();
        apartmentAsBuilding.parkingAvailable();
    }
}
