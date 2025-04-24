package com.xworkz.swiggyapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(restaurantName, deliveryTime, rating, itemCount);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SwiggyDTO) {
            SwiggyDTO dto = (SwiggyDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}