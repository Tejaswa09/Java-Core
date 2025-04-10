package com.xworkz.dominosapp.getuserdata;

import com.xworkz.dominosapp.dominosuserdata.DominosUserDto;

public class DominosRegistration {
    public DominosUserDto dto;
    public void userRegistered(DominosUserDto dominos) {
        if (userValidated(dominos)) {
            System.out.println("Domino's account created successfully!");
            System.out.println("You'll get ₹50 off on your first order!");
            dto = dominos;
        } else {
            System.out.println("Registration failed. Please check your information.");
        }
    }

    public boolean userValidated(DominosUserDto dominos) {
        if (dominos.getMobileNumber() == null || !dominos.getMobileNumber().matches("\\d{10}")) {
            System.out.println("Valid 10-digit mobile number is required");
            return false;
        }

        if (dominos.getName() == null || dominos.getName().isEmpty()) {
            System.out.println("Name is required");
            return false;
        }

        if (dominos.getPassword() == null || dominos.getPassword().length() < 6) {
            System.out.println("Password must be at least 6 characters");
            return false;
        }

        if (dominos.getDeliveryAddress() == null || dominos.getDeliveryAddress().isEmpty()) {
            System.out.println("Delivery address is required");
            return false;
        }

        return true;
    }

    public void getDetails(){
        System.out.println("Mobile No "+dto.getMobileNumber() );
        System.out.println("Name :"+dto.getName());
        System.out.println("Password :"+dto.getPassword());
        System.out.println("Delivery Address :"+dto.getDeliveryAddress());
    }
}