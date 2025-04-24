package com.xworkz.makemytripapp;

public class MakeMyTripRunner {
    public static void main(String[] args) {
        MakeMyTripDTO dto = new MakeMyTripDTO();
        dto.setDestination("Goa");
        dto.setTravelDate("2025-05-10");
        dto.setPrice(3599.99);
        dto.setAirline("IndiGo");
        //System.out.println(dto);

        MakeMyTripDTO dto1 = new MakeMyTripDTO();
        dto1.setDestination("Goa");
        dto1.setTravelDate("2025-05-10");
        dto1.setPrice(3599.99);
        dto1.setAirline("IndiGo");
        System.out.println(dto.equals(dto1));
    }
}