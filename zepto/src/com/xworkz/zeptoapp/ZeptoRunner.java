package com.xworkz.zeptoapp;

import com.xworkz.zeptoapp.getuserdata.ZeptoRegistration;
import com.xworkz.zeptoapp.zeptouserdata.ZeptoUserDto;

public class ZeptoRunner {
    public static void main(String[] args) {
        ZeptoUserDto zepto = new ZeptoUserDto();
        zepto.setPhoneNumber("7899455818");
        zepto.setName("Tejaswa D");
        zepto.setPassword("Zepto123");
        zepto.setTermsAccepted(true);
        System.out.println(zepto);

        ZeptoRegistration zeptoRegistration = new ZeptoRegistration();
        zeptoRegistration.userRegistered(zepto);

        ZeptoUserDto zepto1 = new ZeptoUserDto();
        zepto1.setPhoneNumber("7899455818");
        zepto1.setName("Tejaswa D");
        zepto1.setPassword("Zepto123");
        zepto1.setTermsAccepted(true);

        System.out.println(zepto.equals(zepto1));
    }
}