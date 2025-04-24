package com.xworkz.instagramapp;

import com.xworkz.instagramapp.getuserdata.InstagramRegistration;
import com.xworkz.instagramapp.instagramuserdata.InstagramUserDto;

public class InstagramRunner {
    public static void main(String[] args) {
        InstagramUserDto instagram = new InstagramUserDto();
        instagram.setEmailOrPhone("tejaswad18@gmail.com");
        instagram.setFullName("Tejswa D");
        instagram.setUsername("im.tejaswa");
        instagram.setPassword("insta123");
        System.out.println(instagram);
        InstagramRegistration instagramRegistration = new InstagramRegistration();
        instagramRegistration.userRegistered(instagram);
//        instagramRegistration.getDetails();

        InstagramUserDto dto1 = new InstagramUserDto();
        dto1.setEmailOrPhone("tejaswad18@gmail.com");
        dto1.setFullName("Tejswa D");
        dto1.setUsername("im.tejaswa");
        dto1.setPassword("insta123");

        System.out.println(instagram.equals(dto1));
    }
}