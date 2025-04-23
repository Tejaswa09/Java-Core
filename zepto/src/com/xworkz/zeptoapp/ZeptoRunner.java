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
    }
}