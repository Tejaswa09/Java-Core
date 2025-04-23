package com.xworkz.appleapp;

import com.xworkz.appleapp.getuserdata.AppleRegistration;
import com.xworkz.appleapp.appleuserdata.AppleUserDto;

public class AppleRunner {
    public static void main(String[] args) {
        AppleUserDto apple = new AppleUserDto();
        apple.setFirstName("Tejaswa");
        apple.setLastName("D");
        apple.setAppleId("tejaswa18@apple.com");
        apple.setPassword("Apple@123");
        apple.setConfirmPassword("Apple@123");
        apple.setBirthDate("29/09/2003");
        System.out.println(apple);
        AppleRegistration appleRegistration = new AppleRegistration();
        appleRegistration.userRegistered(apple);
    }
}