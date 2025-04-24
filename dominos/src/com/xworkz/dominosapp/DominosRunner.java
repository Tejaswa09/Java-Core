package com.xworkz.dominosapp;

import com.xworkz.dominosapp.getuserdata.DominosRegistration;
import com.xworkz.dominosapp.dominosuserdata.DominosUserDto;

public class DominosRunner {
    public static void main(String[] args) {
        DominosUserDto dominos = new DominosUserDto();
        dominos.setMobileNumber("7899455818");
        dominos.setName("Tejaswa");
        dominos.setEmail("tejaswad18@gmail.com");
        dominos.setPassword("Tejaswa123");
        dominos.setDeliveryAddress("123, Pizza Street, Bangalore");
        //System.out.println(dominos);
        DominosRegistration dominosRegistration = new DominosRegistration();
        dominosRegistration.userRegistered(dominos);
//        dominosRegistration.getDetails();

        DominosUserDto dominos1 = new DominosUserDto();
        dominos1.setMobileNumber("7899455818");
        dominos1.setName("Tejaswa");
        dominos1.setEmail("tejaswad18@gmail.com");
        dominos1.setPassword("Tejaswa123");
        dominos1.setDeliveryAddress("123, Pizza Street, Bangalore");

        System.out.println(dominos.equals(dominos1));
    }
}