package com.xworkz.lenovoapp;

import com.xworkz.lenovoapp.getuserdata.LenovoRegistration;
import com.xworkz.lenovoapp.lenovouserdata.LenovoUserDto;

public class LenovoRunner {
    public static void main(String[] args) {
        LenovoUserDto lenovo = new LenovoUserDto();
        lenovo.setEmail("tejaswad18@gmail.com");
        lenovo.setPassword("Lenovo@123");
        lenovo.setFirstName("Tejaswa");
        lenovo.setLastName("D");
        lenovo.setCountry("India");
        lenovo.setSubscribeToNewsletter(true);

        LenovoRegistration lenovoRegistration = new LenovoRegistration();
        lenovoRegistration.userRegistered(lenovo);
        lenovoRegistration.getDetails();
    }
}