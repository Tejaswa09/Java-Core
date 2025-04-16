package com.xworkz.facebookapp.getuserdata;

import com.xworkz.facebookapp.facebookuserdata.FacebookUserDto;


public class FacebookRegistration {
    public FacebookUserDto dto;
    public void userRegistered(FacebookUserDto facebook) {
        if (userValidated(facebook)) {
            System.out.println("Facebook account created successfully!");
            System.out.println("Welcome to Facebook, " + facebook.getFirstName() + "!");
            dto= facebook;
        } else {
            System.out.println("Registration failed. Please check your information.");
        }
    }

    public boolean userValidated(FacebookUserDto facebook) {
        if (facebook.getFirstName() == null || facebook.getFirstName().isEmpty()) {
            System.out.println("First name is required");
            return false;
        }

        if (facebook.getLastName() == null || facebook.getLastName().isEmpty()) {
            System.out.println("Last name is required");
            return false;
        }

        if (facebook.getEmailOrMobile() == null || facebook.getEmailOrMobile().isEmpty()) {
            System.out.println("Email or mobile number is required");
            return false;
        }

        if (facebook.getPassword() == null || facebook.getPassword().length() < 6) {
            System.out.println("Password must be at least 6 characters");
            return false;
        }

        if(facebook.getBirthDate()==null){
            return false ;
        }

        if(facebook.getGender()==null){
            return false ;
        }

        return true;
    }

    public  void getDetails(){
        System.out.println("First Name :"+dto.getFirstName());
        System.out.println("Last Name :"+dto.getLastName());
        System.out.println("Email :"+dto.getEmailOrMobile());
        System.out.println("Password :"+dto.getPassword());
        System.out.println("DOB :"+dto.getBirthDate());
    }
}