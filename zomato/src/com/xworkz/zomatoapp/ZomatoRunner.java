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
        System.out.println(user);

        ZomatoRegistration registration = new ZomatoRegistration();
        registration.userRegistered(user);

        ZomatoUserDto user1 = new ZomatoUserDto();
        user1.setFullName("Tejaswa D");
        user1.setEmail("tejaswa@gmail.com");
        user1.setPhone("7899455818");
        user1.setPassword("zomato123");

        System.out.println(user.equals(user1));

    }
}