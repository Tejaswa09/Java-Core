package com.xworkz.flipkartapp.getuserdata;

import com.xworkz.flipkartapp.flipkartuserdata.FlipkartUserDto;

public class FlipkartRegistration {
    public void userRegistered(FlipkartUserDto flipkart) {
        Boolean isValidated = userValidated(flipkart);
        if(isValidated)
            System.out.println("Flipkart User Registration Successful...");
        else
            System.out.println("Registration not successful...please try again later");
    }

    public boolean userValidated(FlipkartUserDto flipkart) {
        boolean isUserValid = false;

        boolean isMobileValid = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPasswordValid = false;

        if(flipkart.getEnterMobileNumber() != null && !flipkart.getEnterMobileNumber().isEmpty())
            isMobileValid = true;
        else
            System.out.println("Please enter mobile number");

        if(flipkart.getFullName() != null && !flipkart.getFullName().isEmpty())
            isNameValid = true;
        else
            System.out.println("Please enter full name");

        if(flipkart.getPassword() != null && !flipkart.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Please enter password");

        if(flipkart.getConfirmPassword() != null &&
                flipkart.getConfirmPassword().equals(flipkart.getPassword()))
            isConfirmPasswordValid = true;
        else
            System.out.println("Passwords do not match");

        if(isMobileValid && isNameValid && isPasswordValid && isConfirmPasswordValid)
            isUserValid = true;

        return isUserValid;
    }
}