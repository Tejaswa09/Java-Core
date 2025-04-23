package com.xworkz.redbusapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RedBusDTO {
    private String source;
    private String destination;
    private String busType;
    private double ticketPrice;

    @Override
    public String toString() {
        return "RedBusDTO [source=" + source + ", destination=" + destination + ", busType=" + busType + ", ticketPrice=" + ticketPrice + "]";
    }
}