package com.xworkz.titanapp.getuserdata;

import com.xworkz.titanapp.titanuserdata.TitanUserDto;

public class TitanRegistration {
    public TitanUserDto dto;
    public void userRegistered(TitanUserDto titan) {
        if (isValid(titan)) {
            System.out.println("Titan account created successfully!");
            System.out.println("Welcome to Titan!");
            dto= titan;
        } else {
            System.out.println("Registration failed. Please check your details.");
        }
    }

    // Simple validation method for beginners
    public boolean isValid(TitanUserDto titan) {
        // Check name
        if (titan.getName() == null || titan.getName().isEmpty()) {
            System.out.println("Please enter your name");
            return false;
        }

        // Check mobile number length
        if (titan.getMobileNumber() == null || titan.getMobileNumber().length() != 10) {
            System.out.println("Please enter 10 digit mobile number");
            return false;
        }

        // Simple email check
        if (titan.getEmail() == null || !titan.getEmail().contains("@")) {
            System.out.println("Please enter valid email");
            return false;
        }

        // Password length check
        if (titan.getPassword() == null || titan.getPassword().length() < 6) {
            System.out.println("Password must be at least 6 characters");
            return false;
        }

        return true;
    }

    public void getDetails (){
        System.out.println("Name :"+dto.getName());
        System.out.println("Mobile Number :"+dto.getMobileNumber());
        System.out.println("Email :"+dto.getEmail());
        System.out.println("Password :"+dto.getPassword());
    }
}