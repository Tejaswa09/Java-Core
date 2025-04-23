package com.xworkz.myntraapp.getuserdata;

import com.xworkz.myntraapp.myntrauserdata.MyntraDto;

public class MyntraRegistration {
    public void userRegistered(MyntraDto myntra) {
        Boolean isValidated = userValidated(myntra);
        if(isValidated)
            System.out.println("Myntra User Registration Successful!");
        else
            System.out.println("Registration failed. Please check your details and try again.");
    }

    public boolean userValidated(MyntraDto myntra) {
        boolean isUserValid = false;

        boolean isNameValid = false;
        boolean isMobileValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isDobValid = false;
        boolean isGenderValid = false;

        if(myntra.getName() != null && !myntra.getName().isEmpty() && myntra.getName().matches("^[a-zA-Z ]+$"))
            isNameValid = true;
        else
            System.out.println("Please enter a valid name (letters only)");

        if(myntra.getMobileNumber() != null && myntra.getMobileNumber().matches("^[6-9]\\d{9}$"))
            isMobileValid = true;
        else
            System.out.println("Please enter a valid 10-digit mobile number");

        if(myntra.getEmail() != null && !myntra.getEmail().isEmpty())
            isEmailValid = true;
        else
            System.out.println("Please enter a valid email address");

        if(myntra.getPassword() != null && myntra.getPassword().length() >= 8)
            isPasswordValid = true;
        else
            System.out.println("Password must be at least 8 characters long");

        if(myntra.getDateOfBirth() != null && !myntra.getDateOfBirth().isEmpty())
            isDobValid = true;
        else
            System.out.println("Please enter your date of birth");

        if(myntra.getGender() != null)
            isGenderValid = true;
        else
            System.out.println("Please select your gender");

        if(isNameValid && isMobileValid && isEmailValid && isPasswordValid && isDobValid && isGenderValid)
            isUserValid = true;

        return isUserValid;
    }
}