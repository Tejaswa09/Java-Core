package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.getuserdata.ZomatoRegistration;
import com.xworkz.zomatoapp.zomatouserdata.ZomatoUserDto;

public class ZomatoRunner {
    public static void main(String[] args) {
        ZomatoUserDto user = new ZomatoUserDto();
        user.setFullName("Tejaswa D");
        user.setEmail("tejaswa@gmail.com");
        user.setPhone("7899455818");
        user.setPassword("zomato123");

        ZomatoRegistration registration = new ZomatoRegistration();
        registration.userRegistered(user);
        registration.getDetails();
    }
}