package com.xworkz.urbanclapapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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
    @Override
    public int hashCode() {
        return Objects.hash(serviceType, professionalName, serviceCharge, bookingDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UrbanClapDTO) {
            UrbanClapDTO dto = (UrbanClapDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}


