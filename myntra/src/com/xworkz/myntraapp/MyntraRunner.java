package com.xworkz.myntraapp;

import com.xworkz.myntraapp.getuserdata.MyntraRegistration;
import com.xworkz.myntraapp.myntrauserdata.MyntraDto;
import com.xworkz.myntraapp.statics.Gender;

public class MyntraRunner {
    public static void main(String[] args) {
        MyntraDto myntra = new MyntraDto();
        myntra.setName("Tejaswa");
        myntra.setMobileNumber("7899455818");
        myntra.setEmail("tejaswa@example.com");
        myntra.setPassword("tejaswa@123");
        myntra.setDateOfBirth("29/09/2003");
        myntra.setGender(Gender.Male);
        myntra.setReceiveUpdates(true);

        System.out.println(myntra);

//        MyntraRegistration myntraRegistration = new MyntraRegistration();
//        myntraRegistration.userRegistered(myntra);

    }
}