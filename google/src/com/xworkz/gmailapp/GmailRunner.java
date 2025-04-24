package com.xworkz.gmailapp;

import com.xworkz.gmailapp.getuserdata.GmailRegistration;
import com.xworkz.gmailapp.gmailuserdata.GmailUserDto;
import com.xworkz.gmailapp.statics.Gender;

public class GmailRunner {
    public static void main(String[] args) {
        GmailUserDto gmail = new GmailUserDto();
        gmail.setFirstName("Tejaswa");
        gmail.setLastName("D");
        gmail.setUsername("tejaswad18");
        gmail.setPassword("Tejaswa@123");
        gmail.setConfirmPassword("Tejaswa@123");
        gmail.setRecoveryEmail("tejaswad18@gmail.com");
        gmail.setPhoneNumber("7899455818");
        gmail.setBirthDay("29");
        gmail.setBirthMonth("September");
        gmail.setBirthYear("2003");
        gmail.setGender(Gender.Male);
        System.out.println(gmail);
        GmailRegistration gmailRegistration = new GmailRegistration();
        gmailRegistration.userRegistered(gmail);

        GmailUserDto gaimail1 = new GmailUserDto();
        gaimail1.setFirstName("Tejaswa");
        gaimail1.setLastName("D");
        gaimail1.setUsername("tejaswad18");
        gaimail1.setPassword("Tejaswa@123");
        gaimail1.setConfirmPassword("Tejaswa@123");
        gaimail1.setRecoveryEmail("tejaswad18@gaimail1.com");
        gaimail1.setPhoneNumber("7899455818");
        gaimail1.setBirthDay("29");
        gaimail1.setBirthMonth("September");
        gaimail1.setBirthYear("2003");
        gaimail1.setGender(Gender.Male);

        System.out.println(gmail.equals(gaimail1));
    }
}