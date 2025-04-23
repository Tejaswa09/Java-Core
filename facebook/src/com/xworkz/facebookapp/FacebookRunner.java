package com.xworkz.facebookapp;

import com.xworkz.facebookapp.getuserdata.FacebookRegistration;
import com.xworkz.facebookapp.facebookuserdata.FacebookUserDto;
import java.time.LocalDate;

public class FacebookRunner {
    public static void main(String[] args) {
        FacebookUserDto facebook = new FacebookUserDto();
        facebook.setFirstName("Tejaswa");
        facebook.setLastName("D");
        facebook.setEmailOrMobile("tejaswad18.com");
        facebook.setPassword("facebook123");
        facebook.setBirthDate("29/09/2003");
        facebook.setGender("Male");
        System.out.println(facebook);
        FacebookRegistration facebookRegistration = new FacebookRegistration();
        facebookRegistration.userRegistered(facebook);

//        facebookRegistration.getDetails();
    }
}