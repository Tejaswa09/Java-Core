package com.xworkz.bigbasketapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(itemName, quantity, pricePerUnit, deliverySlot);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BigBasketDTO) {
            BigBasketDTO dto = (BigBasketDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}