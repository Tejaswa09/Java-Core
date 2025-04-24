package com.xworkz.titanapp;

import com.xworkz.titanapp.getuserdata.TitanRegistration;
import com.xworkz.titanapp.titanuserdata.TitanUserDto;

public class TitanRunner {
    public static void main(String[] args) {
        TitanUserDto titan = new TitanUserDto();
        titan.setName("Tejaswa D");
        titan.setMobileNumber("7899455818");
        titan.setEmail("tejaswa@gmail.com");
        titan.setPassword("titan123");
       // System.out.println(titan);

        TitanRegistration titanRegistration = new TitanRegistration();
        titanRegistration.userRegistered(titan);
      //  titanRegistration.getDetails();

        TitanUserDto titan1 = new TitanUserDto();
        titan1.setName("Tejaswa D");
        titan1.setMobileNumber("7899455818");
        titan1.setEmail("tejaswa@gmail.com");
        titan1.setPassword("titan123");
        System.out.println(titan.equals(titan1));
    }
}