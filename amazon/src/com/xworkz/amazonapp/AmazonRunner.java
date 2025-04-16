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

        AmazonRegistration amazonRegistration = new AmazonRegistration();
        amazonRegistration.userRegistered(amazon);
    }
}
