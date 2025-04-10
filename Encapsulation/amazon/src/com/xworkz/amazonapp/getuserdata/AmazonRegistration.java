package com.xworkz.amazonapp.getuserdata;

import com.xworkz.amazonapp.amazonuserdata.AmazonUserDto ;

public class AmazonRegistration {
    public void userRegistered(AmazonUserDto amazon) {
        Boolean isValidated = userValidated(amazon);
        if(isValidated)
            System.out.println("Amazon User Registration Successful...");
        else
            System.out.println("Registration not successful...please try again later");
    }

    public boolean userValidated(AmazonUserDto amazon) {
        boolean isUserValid = false;

        boolean isNameValid = false;
        boolean isContactValid = false;
        boolean isPasswordValid = false;
        boolean isEmailValid = false;
        boolean isBirthDayValid = false;
        boolean isGenderValid = false;

        if(amazon.getName() != null && !amazon.getName().isEmpty())
            isNameValid = true;
        else
            System.out.println("Please enter a valid name");

        if(amazon.getMobileNumber() != 0 ||
                (amazon.getEmail() != null && !amazon.getEmail().isEmpty()))
            isContactValid = true;
        else
            System.out.println("Please enter mobile number or email");

        if(amazon.getPassword() != null && !amazon.getPassword().isEmpty())
            isPasswordValid = true;
        else
            System.out.println("Please enter a valid password");

        if(amazon.getBirthDay() != null && !amazon.getBirthDay().isEmpty())
            isBirthDayValid = true;
        else
            System.out.println("Please enter your birth date");

        if(amazon.getGender() != null)
            isGenderValid = true;
        else
            System.out.println("Please select your gender");

        if(isNameValid && isContactValid && isPasswordValid && isBirthDayValid && isGenderValid)
            isUserValid = true;

        return isUserValid;
    }
}