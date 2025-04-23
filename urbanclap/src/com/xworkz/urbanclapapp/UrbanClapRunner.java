package com.xworkz.urbanclapapp;

public class UrbanClapRunner {
    public static void main(String[] args) {
        UrbanClapDTO dto = new UrbanClapDTO();
        dto.setServiceType("AC Repair");
        dto.setProfessionalName("Ajay Kumar");
        dto.setServiceCharge(499.0);
        dto.setBookingDate("2025-05-01");
        System.out.println(dto);
    }
}
