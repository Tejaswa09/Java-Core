package com.xworkz.phonepeapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhonePeDTO {
    private String transactionId;
    private double amount;
    private String receiver;
    private String transactionDate;

    @Override
    public String toString() {
        return "PhonePeDTO [transactionId=" + transactionId + ", amount=" + amount + ", receiver=" + receiver + ", transactionDate=" + transactionDate + "]";
    }
}