package com.xworkz.olaapp;

import lombok.Getter;
import lombok.Setter;

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
}
