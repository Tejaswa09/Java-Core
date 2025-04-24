package com.xworkz.olaapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class OlaDTO {
    private String driverName;
    private String carModel;
    private String licensePlate;
    private double fare;



    @Override
    public String toString() {
        return "OlaDTO (driverName=" + driverName + ", carModel=" + carModel +
                ", licensePlate=" + licensePlate + ", fare=" + fare + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverName, carModel, licensePlate, fare);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OlaDTO) {
            OlaDTO dto = (OlaDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}
