package com.xworkz.snapchatapp;

import com.xworkz.snapchatapp.snapchatuserdata.SnapchatUserDto;
import com.xworkz.snapchatapp.snapchatuserregistration.SnapchatUserRegistration;

public class SnapchatRunner {
    public static void main(String[] args) {
        SnapchatUserDto userDto = new SnapchatUserDto();

        userDto.setFirstName("Tejaswa");
        userDto.setLastName("D");
        userDto.setMonth(9);
        userDto.setYear(2003);
        userDto.setDay(29);
        userDto.setUserName("tejaswa");
        userDto.setPassword("Teja123");
        System.out.println(userDto);

        SnapchatUserRegistration registration= new SnapchatUserRegistration();
        registration.userRegistration(userDto);
//        registration.getUserDetails();

        SnapchatUserDto userDto1 = new SnapchatUserDto();

        userDto1.setFirstName("Tejaswa");
        userDto1.setLastName("D");
        userDto1.setMonth(9);
        userDto1.setYear(2003);
        userDto1.setDay(29);
        userDto1.setUserName("tejaswa");
        userDto1.setPassword("Teja123");

        System.out.println(userDto.equals(userDto1));
    }

}
