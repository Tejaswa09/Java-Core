package com.xworkz.zeptoapp.getuserdata;

import com.xworkz.zeptoapp.zeptouserdata.ZeptoUserDto;

public class ZeptoRegistration {
    public void userRegistered(ZeptoUserDto zepto) {
        Boolean isValidated = userValidated(zepto);
        if(isValidated)
            System.out.println("Zepto User Registration Successful!");
        else
            System.out.println("Registration failed. Please check your details and try again.");
    }

    public boolean userValidated(ZeptoUserDto zepto) {
        boolean isUserValid = false;

        boolean isPhoneValid = false;
        boolean isNameValid = false;
        boolean isPasswordValid = false;
        boolean isTermsAccepted = false;

        if(zepto.getPhoneNumber() != null && zepto.getPhoneNumber().matches("^[6-9]\\d{9}$"))
            isPhoneValid = true;
        else
            System.out.println("Please enter a valid 10-digit Indian phone number");

        if(zepto.getName() != null && !zepto.getName().isEmpty())
            isNameValid = true;
        else
            System.out.println("Please enter your name");

        if(zepto.getPassword() != null && zepto.getPassword().length() >= 6)
            isPasswordValid = true;
        else
            System.out.println("Password must be at least 6 characters long");

        if(zepto.isTermsAccepted())
            isTermsAccepted = true;
        else
            System.out.println("You must accept the terms and conditions");

        if(isPhoneValid && isNameValid && isPasswordValid && isTermsAccepted)
            isUserValid = true;

        return isUserValid;
    }
}