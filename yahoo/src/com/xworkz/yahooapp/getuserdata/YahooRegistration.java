package com.xworkz.yahooapp.getuserdata;

import com.xworkz.yahooapp.yahoouserdata.YahooUserDto;

public class YahooRegistration {
    public void userRegistered(YahooUserDto yahoo) {
        if (userValidated(yahoo)) {
            System.out.println("Yahoo account created successfully!");
            System.out.println("Your Yahoo ID: " + yahoo.getYahooId() + "@yahoo.com");
        } else {
            System.out.println("Registration failed. Please check your information.");
        }
    }

    public boolean userValidated(YahooUserDto yahoo) {
        if (yahoo.getFirstName() == null || yahoo.getFirstName().isEmpty()) {
            System.out.println("First name is required");
            return false;
        }

        if (yahoo.getLastName() == null || yahoo.getLastName().isEmpty()) {
            System.out.println("Last name is required");
            return false;
        }

        if (yahoo.getYahooId() == null || yahoo.getYahooId().isEmpty()) {
            System.out.println("Yahoo ID is required");
            return false;
        }

        if (yahoo.getPassword() == null || yahoo.getPassword().length() < 8) {
            System.out.println("Password must be at least 8 characters");
            return false;
        }

        if (yahoo.getMobileNumber() == null || !yahoo.getMobileNumber().matches("\\d{10}")) {
            System.out.println("Valid 10-digit mobile number is required");
            return false;
        }

        if (yahoo.getBirthMonth() == null || yahoo.getBirthDay() == null || yahoo.getBirthYear() == null) {
            System.out.println("Complete birth date is required");
            return false;
        }

        if (yahoo.getGender() == null ) {
            System.out.println("Gender is required");
            return false;
        }

        return true;
    }
}