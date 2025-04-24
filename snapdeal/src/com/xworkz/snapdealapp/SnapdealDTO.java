package com.xworkz.snapdealapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class SnapdealDTO {
    private String productName;
    private double discount;
    private int availableQuantity;
    private String sellerName;

    @Override
    public String toString() {
        return "SnapdealDTO [productName=" + productName + ", discount=" + discount + "%, availableQuantity=" + availableQuantity + ", sellerName=" + sellerName + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, discount, availableQuantity, sellerName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SnapdealDTO) {
            SnapdealDTO dto = (SnapdealDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}