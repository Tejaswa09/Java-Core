package com.xworkz.yahooapp;

import com.xworkz.yahooapp.getuserdata.YahooRegistration;
import com.xworkz.yahooapp.statics.Gender;
import com.xworkz.yahooapp.yahoouserdata.YahooUserDto;

public class YahooRunner {
    public static void main(String[] args) {
        YahooUserDto yahoo = new YahooUserDto();
        yahoo.setFirstName("Tejaswa");
        yahoo.setLastName("D");
        yahoo.setYahooId("Tejaswa");
        yahoo.setPassword("Yahoo@123");
        yahoo.setMobileNumber("7899455818");
        yahoo.setBirthMonth("September");
        yahoo.setBirthDay("29");
        yahoo.setBirthYear("2003");
        yahoo.setGender(Gender.Male);
        System.out.println(yahoo);

        YahooRegistration yahooRegistration = new YahooRegistration();
        yahooRegistration.userRegistered(yahoo);

        YahooUserDto yahoo1 = new YahooUserDto();
        yahoo1.setFirstName("Tejaswa");
        yahoo1.setLastName("D");
        yahoo1.setYahooId("Tejaswa");
        yahoo1.setPassword("Yahoo@123");
        yahoo1.setMobileNumber("7899455818");
        yahoo1.setBirthMonth("September");
        yahoo1.setBirthDay("29");
        yahoo1.setBirthYear("2003");
        yahoo1.setGender(Gender.Male);

        System.out.println(yahoo.equals(yahoo1));
    }
}