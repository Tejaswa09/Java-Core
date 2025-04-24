package com.xworkz.airbnbapp;

public class AirbnbRunner {
    public static void main(String[] args) {
        AirbnbDTO dto = new AirbnbDTO();
        dto.setPropertyType("Villa");
        dto.setLocation("Goa");
        dto.setPricePerNight(5000.0);
        dto.setRating(4);
        //System.out.println(dto);

        AirbnbDTO dto1 = new AirbnbDTO();
        dto1.setPropertyType("Villa");
        dto1.setLocation("Goa");
        dto1.setPricePerNight(5000.0);
        dto1.setRating(4);
        System.out.println(dto.equals(dto1));
    }
}
