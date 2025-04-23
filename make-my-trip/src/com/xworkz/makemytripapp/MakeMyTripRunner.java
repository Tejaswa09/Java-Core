package com.xworkz.makemytripapp;

public class MakeMyTripRunner {
    public static void main(String[] args) {
        MakeMyTripDTO dto = new MakeMyTripDTO();
        dto.setDestination("Goa");
        dto.setTravelDate("2025-05-10");
        dto.setPrice(3599.99);
        dto.setAirline("IndiGo");
        System.out.println(dto);
    }
}