package com.xworkz.gmailapp.getuserdata;

import com.xworkz.gmailapp.gmailuserdata.GmailUserDto;

public class GmailRegistration {
    public void userRegistered(GmailUserDto gmail) {
        Boolean isValidated = userValidated(gmail);
        if(isValidated) {
            System.out.println("Gmail Account Created Successfully!");
            System.out.println("Your new Gmail address: " + gmail.getUsername() + "@gmail.com");
        } else {
            System.out.println("Account creation failed. Please check your information.");
        }
    }

    public boolean userValidated(GmailUserDto gmail) {
        boolean isValid = true;

        
        if(gmail.getFirstName() == null || gmail.getFirstName().isEmpty()) {
            System.out.println("First name is required");
            isValid = false;
        }
        if(gmail.getLastName() == null || gmail.getLastName().isEmpty()) {
            System.out.println("Last name is required");
            isValid = false;
        }


        if(gmail.getUsername() == null || gmail.getUsername().isEmpty()) {
            System.out.println("Username is required");
            isValid = false;
        } else if(gmail.getUsername().length() < 6) {
            System.out.println("Username must be at least 6 characters");
            isValid = false;
        }


        if(gmail.getPassword() == null || gmail.getPassword().isEmpty()) {
            System.out.println("Password is required");
            isValid = false;
        } else if(gmail.getPassword().length() < 8) {
            System.out.println("Password must be at least 8 characters");
            isValid = false;
        }


        if(!gmail.getPassword().equals(gmail.getConfirmPassword())) {
            System.out.println("Passwords don't match");
            isValid = false;
        }


        if(gmail.getBirthDay() == null || gmail.getBirthMonth() == null || gmail.getBirthYear() == null) {
            System.out.println("Birth date is required");
            isValid = false;
        }


        if(gmail.getGender() == null ) {
            System.out.println("Gender is required");
            isValid = false;
        }


        if((gmail.getPhoneNumber() == null || gmail.getPhoneNumber().isEmpty()) &&
                (gmail.getRecoveryEmail() == null || gmail.getRecoveryEmail().isEmpty())) {
            System.out.println("Phone number or recovery email is required");
            isValid = false;
        }

        return isValid;
    }
}