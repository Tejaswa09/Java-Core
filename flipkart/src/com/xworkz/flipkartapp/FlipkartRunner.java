package com.xworkz.flipkartapp;

import com.xworkz.flipkartapp.getuserdata.FlipkartRegistration;
import com.xworkz.flipkartapp.flipkartuserdata.FlipkartUserDto;

public class FlipkartRunner {
    public static void main(String[] args) {
        FlipkartUserDto flipkart = new FlipkartUserDto();
        flipkart.setEnterMobileNumber("7899455818");
        flipkart.setFullName("Tejaswa");
        flipkart.setPassword("Tejaswa@123");
        flipkart.setConfirmPassword("Tejaswa@123");

        FlipkartRegistration flipkartRegistration = new FlipkartRegistration();
        flipkartRegistration.userRegistered(flipkart);
    }
}