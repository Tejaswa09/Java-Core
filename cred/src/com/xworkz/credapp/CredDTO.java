package com.xworkz.credapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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



    @Override
    public int hashCode() {
        return Objects.hash(userName, cardType, billAmount, dueDate);
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if (obj instanceof CredDTO) {
            CredDTO user = (CredDTO) obj;
            if (this.hashCode()==user.hashCode()) {
                System.out.println(this.hashCode());
                System.out.println(user.hashCode());
                isEqual = true;
            }
        }
        return isEqual;
    }



}