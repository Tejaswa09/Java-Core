package com.xworkz.airbnbapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirbnbDTO {
    private String propertyType;
    private String location;
    private double pricePerNight;
    private int rating;

    @Override
    public String toString() {
        return "AirbnbDTO [propertyType=" + propertyType + ", location=" + location + ", pricePerNight=" + pricePerNight + ", rating=" + rating + "]";
    }
}