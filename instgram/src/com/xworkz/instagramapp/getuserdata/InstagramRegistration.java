package com.xworkz.instagramapp.getuserdata;

import com.xworkz.instagramapp.instagramuserdata.InstagramUserDto;

public class InstagramRegistration {
    public InstagramUserDto dto;
    public void userRegistered(InstagramUserDto instagram) {
        if (userValidated(instagram)) {
            System.out.println("Instagram account created successfully!");
            dto = instagram;
        } else {
            System.out.println("Registration failed. Please check your information.");
        }
    }

    public boolean userValidated(InstagramUserDto instagram) {
        if (instagram.getEmailOrPhone() == null || instagram.getEmailOrPhone().isEmpty()) {
            System.out.println("Email or phone number is required");
            return false;
        }

        if (instagram.getFullName() == null || instagram.getFullName().isEmpty()) {
            System.out.println("Full name is required");
            return false;
        }

        if (instagram.getUsername() == null || instagram.getUsername().isEmpty()) {
            System.out.println("Username is required");
            return false;
        }

        if (instagram.getPassword() == null || instagram.getPassword().length() < 6) {
            System.out.println("Password must be at least 6 characters");
            return false;
        }

        return true;
    }

    public void getDetails(){
        System.out.println("Mobile :"+dto.getEmailOrPhone());
        System.out.println("Full Name :"+dto.getFullName());
        System.out.println("Password :"+dto.getPassword());
        System.out.println("username :"+dto.getUsername());
    }
}