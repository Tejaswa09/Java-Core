package com.xworkz.lenovoapp.getuserdata;

import com.xworkz.lenovoapp.lenovouserdata.LenovoUserDto;

public class LenovoRegistration {
    public LenovoUserDto dto;
    public void userRegistered(LenovoUserDto lenovo) {
        if (userValidated(lenovo)) {
            System.out.println("Lenovo account created successfully!");
            if (lenovo.isSubscribeToNewsletter()) {
                System.out.println("You'll receive product updates and offers!");
                dto = lenovo;
            }
        } else {
            System.out.println("Registration failed. Please check your information.");
        }
    }

    public boolean userValidated(LenovoUserDto lenovo) {
        if (lenovo.getEmail() == null || !lenovo.getEmail().contains("@")) {
            System.out.println("Valid email address is required");
            return false;
        }

        if (lenovo.getPassword() == null || lenovo.getPassword().length() < 8) {
            System.out.println("Password must be at least 8 characters");
            return false;
        }

        if (lenovo.getFirstName() == null || lenovo.getFirstName().isEmpty()) {
            System.out.println("First name is required");
            return false;
        }

        if (lenovo.getCountry() == null || lenovo.getCountry().isEmpty()) {
            System.out.println("Country is required");
            return false;
        }

        return true;
    }

    public void getDetails(){
        System.out.println("Email :"+dto.getEmail());
        System.out.println("Password :"+dto.getPassword());
        System.out.println("First Name :"+dto.getFirstName());
        System.out.println("Last Name :"+dto.getLastName());
        System.out.println("Country :"+dto.getCountry());
    }
}