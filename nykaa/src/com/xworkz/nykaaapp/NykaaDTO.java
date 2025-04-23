package com.xworkz.nykaaapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NykaaDTO {
    private String productName;
    private String brand;
    private double price;
    private String skinType;

    @Override
    public String toString() {
        return "NykaaDTO [productName=" + productName + ", brand=" + brand + ", price=" + price + ", skinType=" + skinType + "]";
    }
}