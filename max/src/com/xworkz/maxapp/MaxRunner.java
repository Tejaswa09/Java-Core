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

        MaxUserDto max1 = new MaxUserDto();
        max1.setFullName("Tejaswa D");
        max1.setDob("29/09/2003");
        max1.setEmail("tejaswad28@gmail.com");
        max1.setPincode(584128);
        max1.setGender(Gender.Male);
        max1.setMobileNumber(7899455818L);
        max1.setPincode(6622);
        max1.setPassword("Teja@123");

        System.out.println(max.equals(max1));
    }
}
