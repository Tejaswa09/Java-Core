package com.xworkz.redbusapp;

public class RedBusRunner {
    public static void main(String[] args) {
        RedBusDTO dto = new RedBusDTO();
        dto.setSource("Bangalore");
        dto.setDestination("Hyderabad");
        dto.setBusType("Volvo Sleeper");
        dto.setTicketPrice(799.0);
        System.out.println(dto);
    }
}
