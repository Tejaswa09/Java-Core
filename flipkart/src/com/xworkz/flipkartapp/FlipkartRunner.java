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
       // System.out.println(flipkart);
        FlipkartRegistration flipkartRegistration = new FlipkartRegistration();
        flipkartRegistration.userRegistered(flipkart);

        FlipkartUserDto flipkart1 = new FlipkartUserDto();
        flipkart1.setEnterMobileNumber("7899455818");
        flipkart1.setFullName("Tejaswa");
        flipkart1.setPassword("Tejaswa@123");
        flipkart1.setConfirmPassword("Tejaswa@123");

        System.out.println(flipkart.equals(flipkart1));
    }
}