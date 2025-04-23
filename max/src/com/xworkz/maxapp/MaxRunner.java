package com.xworkz.maxapp;

import com.xworkz.maxapp.getuserdata.MaxFashionRegistration;
import com.xworkz.maxapp.maxuserdata.MaxUserDto;
import com.xworkz.maxapp.statics.Gender;

public class MaxRunner {
    public static void main(String[] args) {
        MaxUserDto max = new MaxUserDto();
        max.setFullName("Tejaswa D");
        max.setDob("29/09/2003");
        max.setEmail("tejaswad28@gmail.com");
        max.setPincode(584128);
        max.setGender(Gender.Male);
        max.setMobileNumber(7899455818L);
        max.setPincode(6622);
        max.setPassword("Teja@123");
        System.out.println(max);

        MaxFashionRegistration maxFashionRegistration = new MaxFashionRegistration();
        maxFashionRegistration.userRegistered(max);
    }
}
