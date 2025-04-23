package com.xworkz.blinkitapp;

import com.xworkz.blinkitapp.getuserdata.BlinkitRegistration;
import com.xworkz.blinkitapp.blinkituserdata.BlinkitUserDto;

public class BlinkitRunner {
    public static void main(String[] args) {
        BlinkitUserDto blinkit = new BlinkitUserDto();
        blinkit.setPhoneNumber("9876543210");
        blinkit.setName("Rahul Sharma");
        blinkit.setPassword("Blinkit123");
        blinkit.setTermsAccepted(true);
        System.out.println(blinkit);
        BlinkitRegistration blinkitRegistration = new BlinkitRegistration();
        blinkitRegistration.userRegistered(blinkit);
    }
}