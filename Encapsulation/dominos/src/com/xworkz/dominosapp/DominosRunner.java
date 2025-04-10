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

        DominosRegistration dominosRegistration = new DominosRegistration();
        dominosRegistration.userRegistered(dominos);
        dominosRegistration.getDetails();
    }
}