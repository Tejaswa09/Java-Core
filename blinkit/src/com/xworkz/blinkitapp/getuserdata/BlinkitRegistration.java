package com.xworkz.blinkitapp.getuserdata;

import com.xworkz.blinkitapp.blinkituserdata.BlinkitUserDto;

public class BlinkitRegistration {
    public void userRegistered(BlinkitUserDto blinkit) {
        Boolean isValidated = userValidated(blinkit);
        if(isValidated) {
            System.out.println("Blinkit User Registration Successful!");
        } else {
            System.out.println("Registration failed. Please check required fields.");
        }
    }

    public boolean userValidated(BlinkitUserDto blinkit) {
        boolean isPhoneValid = false;
        boolean isNameValid = false;
        boolean isPasswordValid = false;
        boolean isTermsAccepted = false;
        boolean isUserValid = false;

        if (blinkit.getPhoneNumber() != null && blinkit.getPhoneNumber().matches("^[6-9]\\d{9}$"))
            isPhoneValid = true;
        else
            System.out.println("Please enter a valid 10-digit Indian phone number");

        if (blinkit.getName() != null && !blinkit.getName().isEmpty())
            isNameValid = true;
        else
            System.out.println("Please enter your name");

        if (blinkit.getPassword() != null && blinkit.getPassword().length() >= 6)
            isPasswordValid = true;
        else
            System.out.println("Password must be at least 6 characters long");

        if (blinkit.isTermsAccepted())
            isTermsAccepted = true;
        else
            System.out.println("You must accept the terms and conditions");

        if (isPhoneValid && isNameValid && isPasswordValid && isTermsAccepted)
            isUserValid = true;

        return isUserValid;

    }
}