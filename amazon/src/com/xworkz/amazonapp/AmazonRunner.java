package com.xworkz.amazonapp;

import com.xworkz.amazonapp.getuserdata.AmazonRegistration;
import com.xworkz.amazonapp.amazonuserdata.AmazonUserDto;
import com.xworkz.amazonapp.statics.Gender;

public class AmazonRunner {
    public static void main(String[] args) {
        AmazonUserDto amazon = new AmazonUserDto();
        amazon.setName("Tejaswa");
        amazon.setMobileNumber(7899455818L);
        amazon.setPassword("Amazon@123");
        amazon.setBirthDay("01/01/1990");
        amazon.setGender(Gender.Male);
       // System.out.println(amazon);
        AmazonRegistration amazonRegistration = new AmazonRegistration();
        amazonRegistration.userRegistered(amazon);

        AmazonUserDto amazon1 = new AmazonUserDto();
        amazon1.setName("Tejaswa");
        amazon1.setMobileNumber(7899455818L);
        amazon1.setPassword("Amazon@123");
        amazon1.setBirthDay("01/01/1990");
        amazon1.setGender(Gender.Male);

        System.out.println(amazon.equals(amazon1));
    }
}
