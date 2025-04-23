package com.xworkz.snapdealapp;

import lombok.Getter;
import lombok.Setter;

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
}