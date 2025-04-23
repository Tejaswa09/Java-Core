package com.xworkz.bigbasketapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BigBasketDTO {
    private String itemName;
    private int quantity;
    private double pricePerUnit;
    private String deliverySlot;

    @Override
    public String toString() {
        return "BigBasketDTO [itemName=" + itemName + ", quantity=" + quantity + ", pricePerUnit=" + pricePerUnit + ", deliverySlot=" + deliverySlot + "]";
    }
}