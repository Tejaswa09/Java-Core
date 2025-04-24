package com.xworkz.airbnbapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(propertyType, location, pricePerNight, rating);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AirbnbDTO) {
            AirbnbDTO dto = (AirbnbDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}