package com.xworkz.urbanclapapp;

public class UrbanClapRunner {
    public static void main(String[] args) {
        UrbanClapDTO dto = new UrbanClapDTO();
        dto.setServiceType("AC Repair");
        dto.setProfessionalName("Ajay Kumar");
        dto.setServiceCharge(499.0);
        dto.setBookingDate("2025-05-01");
        //System.out.println(dto);

        UrbanClapDTO dto1 = new UrbanClapDTO();
        dto1.setServiceType("AC Repair");
        dto1.setProfessionalName("Ajay Kumar");
        dto1.setServiceCharge(499.0);
        dto1.setBookingDate("2025-05-01");

        System.out.println(dto.equals(dto1));
    }
}
