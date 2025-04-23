package com.xworkz.urbanclapapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UrbanClapDTO {
    private String serviceType;
    private String professionalName;
    private double serviceCharge;
    private String bookingDate;

    @Override
    public String toString() {
        return "UrbanClapDTO [serviceType=" + serviceType + ", professionalName=" + professionalName + ", serviceCharge=" + serviceCharge + ", bookingDate=" + bookingDate + "]";
    }
}