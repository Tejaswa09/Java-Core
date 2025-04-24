package com.xworkz.makemytripapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(destination, travelDate, price, airline);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MakeMyTripDTO) {
            MakeMyTripDTO dto = (MakeMyTripDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}