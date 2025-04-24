package com.xworkz.phonepeapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, amount, receiver, transactionDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PhonePeDTO) {
            PhonePeDTO dto = (PhonePeDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}