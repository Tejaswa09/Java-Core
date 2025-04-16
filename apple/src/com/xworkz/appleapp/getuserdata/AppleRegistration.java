package com.xworkz.appleapp.getuserdata;

import com.xworkz.appleapp.appleuserdata.AppleUserDto;

public class AppleRegistration {
    public void userRegistered(AppleUserDto apple) {
        if (userValidated(apple)) {
            System.out.println("Apple ID created successfully!");
        } else {
            System.out.println("Registration failed. Please check your information.");
        }
    }

    public boolean userValidated(AppleUserDto apple) {
        if (apple.getFirstName() == null || apple.getFirstName().isEmpty()) {
            System.out.println("First name is required");
            return false;
        }

        if (apple.getLastName() == null || apple.getLastName().isEmpty()) {
            System.out.println("Last name is required");
            return false;
        }

        if (apple.getAppleId() == null || apple.getAppleId().isEmpty()) {
            System.out.println("Apple ID is required");
            return false;
        }

        if (apple.getPassword() == null || apple.getPassword().length() < 8) {
            System.out.println("Password must be at least 8 characters");
            return false;
        }

        if (!apple.getPassword().equals(apple.getConfirmPassword())) {
            System.out.println("Passwords don't match");
            return false;
        }

        if (apple.getBirthDate() == null || apple.getBirthDate().isEmpty()) {
            System.out.println("Birth date is required");
            return false;
        }

        return true;
    }
}