package com.xworkz.zomatoapp.getuserdata;

import com.xworkz.zomatoapp.zomatouserdata.ZomatoUserDto;

public class ZomatoRegistration {
    public ZomatoUserDto dto;
    public void userRegistered(ZomatoUserDto zomato) {
        if (isValid(zomato)) {
            System.out.println("Zomato account created successfully!");
            System.out.println("Get ₹100 off your first order!");
            this.dto = zomato;
        } else {
            System.out.println("Registration failed. Please check your details.");
        }
    }

    private boolean isValid(ZomatoUserDto zomato) {

        if (zomato.getFullName() == null || zomato.getFullName().isEmpty()) {
            System.out.println("Full name is required");
            return false;
        }

        if (zomato.getEmail() == null || !zomato.getEmail().contains("@")) {
            System.out.println("Please enter a valid email");
            return false;
        }

        if (zomato.getPhone() == null || zomato.getPhone().length() != 10) {
            System.out.println("Phone number must be 10 digits");
            return false;
        }
        
        if (zomato.getPassword() == null || zomato.getPassword().length() < 6) {
            System.out.println("Password must be at least 6 characters");
            return false;
        }

        return true;
    }

    public void getDetails(){
        System.out.println("Name :"+dto.getFullName());
        System.out.println("Email :"+dto.getEmail());
        System.out.println("Mobile :"+dto.getPhone());
        System.out.println("Password :"+dto.getPassword());
    }
}