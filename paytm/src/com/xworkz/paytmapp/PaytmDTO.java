package com.xworkz.paytmapp;

import lombok.Getter;
import lombok.Setter;

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
}
