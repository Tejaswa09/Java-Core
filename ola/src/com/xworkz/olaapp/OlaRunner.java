package com.xworkz.olaapp;
import com.xworkz.olaapp.OlaDTO;

public class OlaRunner {
    public static void main(String[] args) {
        OlaDTO ride = new OlaDTO();
        ride.setDriverName("Tejaswa");
        ride.setCarModel("Thar");
        ride.setFare(250.0);
        ride.setLicensePlate("KA36U3124");
        //System.out.println(ride);

        OlaDTO ride1 = new OlaDTO();
        ride1.setDriverName("Tejaswa");
        ride1.setCarModel("Thar");
        ride1.setFare(250.0);
        ride1.setLicensePlate("KA36U3124");
        System.out.println(ride.equals(ride1));
    }
}

