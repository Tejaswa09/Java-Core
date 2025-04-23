package com.xworkz.swiggyapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SwiggyDTO {
    private String restaurantName;
    private int deliveryTime;
    private double rating;
    private int itemCount;

    @Override
    public String toString() {
        return "SwiggyDTO [restaurantName=" + restaurantName + ", deliveryTime=" + deliveryTime + " mins, rating=" + rating + ", itemCount=" + itemCount + "]";
    }
}