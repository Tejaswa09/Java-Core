package com.xworkz.handmapp;

import com.xworkz.handmapp.getuserdata.HandMUserRegistration;
import com.xworkz.handmapp.userdata.HandMUserDto;

public class HandMRunner {
    public static void main(String[] args) {
        HandMUserDto handm = new HandMUserDto();

        handm.setEmail("tejaswad18@gmail.com");
        handm.setDob("29/09/2003");
        handm.setPassword("Teja123");
        handm.setAcceptedTerm(true);
        System.out.println(handm);
        HandMUserRegistration handmreg = new HandMUserRegistration();
        handmreg.registration(handm);

        HandMUserDto handm1 = new HandMUserDto();

        handm1.setEmail("tejaswad18@gmail.com");
        handm1.setDob("29/09/2003");
        handm1.setPassword("Teja123");
        handm1.setAcceptedTerm(true);

        System.out.println(handm.equals(handm1));
    }
}
