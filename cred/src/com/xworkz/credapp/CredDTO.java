package com.xworkz.credapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CredDTO {
    private String userName;
    private String cardType;
    private double billAmount;
    private String dueDate;

    @Override
    public String toString() {
        return "CredDTO [userName=" + userName + ", cardType=" + cardType + ", billAmount=" + billAmount + ", dueDate=" + dueDate + "]";
    }
}