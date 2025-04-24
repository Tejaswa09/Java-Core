package com.xworkz.nykaaapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj){
        if (obj instanceof NykaaDTO){
            NykaaDTO dto=(NykaaDTO)obj;
            if(this.hashCode() == dto.hashCode()){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, brand, price, skinType);
    }
}