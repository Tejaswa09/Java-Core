package com.xworkz.paytmapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class PaytmDTO {
    private String rechargeType;
    private String mobileNumber;
    private double amount;
    private String operator;

    @Override
    public String toString() {
        return "PaytmDTO [rechargeType=" + rechargeType + ", mobileNumber=" + mobileNumber + ", amount=" + amount + ", operator=" + operator + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(rechargeType, mobileNumber, amount, operator);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PaytmDTO) {
            PaytmDTO dto = (PaytmDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}
