package com.xworkz.linkedinapp;

import com.xworkz.linkedinapp.linkedinuserdata.LinkedinUserDto;
import com.xworkz.linkedinapp.statics.Gender;
import com.xworkz.linkedinapp.userregistration.LinkedinUserRegistration;

public class LinkedinRunner {
    public static void main(String[] args) {
        LinkedinUserDto userDto = new LinkedinUserDto();
        userDto.setFirstName("Tejaswa");
        userDto.setLastName("D");
        userDto.setDay(29);
        userDto.setMonth(9);
        userDto.setYear(2003);
        userDto.setUserName("Tejaswa");
        userDto.setPassword("Teja123");
        userDto.setGender(Gender.Male);
        System.out.println(userDto);

        LinkedinUserRegistration user = new LinkedinUserRegistration();
        user.registerUser(userDto);
        user.getUserDetails();

        LinkedinUserDto userDto1 = new LinkedinUserDto();
        userDto1.setFirstName("Tejaswa");
        userDto1.setLastName("D");
        userDto1.setDay(29);
        userDto1.setMonth(9);
        userDto1.setYear(2003);
        userDto1.setUserName("Tejaswa");
        userDto1.setPassword("Teja123");
        userDto1.setGender(Gender.Male);

        System.out.println(userDto.equals(userDto1));

    }
}
