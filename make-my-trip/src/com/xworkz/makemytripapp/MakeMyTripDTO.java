package com.xworkz.makemytripapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MakeMyTripDTO {
    private String destination;
    private String travelDate;
    private double price;
    private String airline;

    @Override
    public String toString() {
        return "MakeMyTripDTO [destination=" + destination + ", travelDate=" + travelDate + ", price=" + price + ", airline=" + airline + "]";
    }
}