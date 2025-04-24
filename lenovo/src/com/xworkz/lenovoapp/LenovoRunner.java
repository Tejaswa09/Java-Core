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
        System.out.println(lenovo);

        LenovoRegistration lenovoRegistration = new LenovoRegistration();
        lenovoRegistration.userRegistered(lenovo);
        //lenovoRegistration.getDetails();

        LenovoUserDto lennovo1 = new LenovoUserDto();
        lennovo1.setEmail("tejaswad18@gmail.com");
        lennovo1.setPassword("lennovo1@123");
        lennovo1.setFirstName("Tejaswa");
        lennovo1.setLastName("D");
        lennovo1.setCountry("India");
        lennovo1.setSubscribeToNewsletter(true);

        System.out.println(lenovo.equals(lennovo1));
    }
}