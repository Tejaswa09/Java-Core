package com.xworkz.passportapp;
//process of grouping data into single unit is called encapsulation;

import com.xworkz.passportapp.constants.CpvLocation;
import com.xworkz.passportapp.constants.DcdrLocation;
import com.xworkz.passportapp.getpassport.PassportSeva;
import com.xworkz.passportapp.passport.PassportDto;

public class PassportRunner {
    public static void main(String[] args) {
        PassportDto passportdto=new PassportDto();
        passportdto.setCpvLocation(CpvLocation.Bangalore);
        passportdto.setDcdrLocation(DcdrLocation.Bangalore);
        passportdto.setGivenName("Tejaswa");
        passportdto.setSurName("sDunaboyina");
        passportdto.setDob("29/09/2003");
        passportdto.setEmail("tejaswad18@gmail.com");
        passportdto.setEmailLoginSame(true);
        passportdto.setLoginId("tejaswad18@gmail.com");
        passportdto.setPwd("Tejaswa@123");
        passportdto.setConfirmPwd("Tejaswa@123");
        passportdto.setHintQues("question");
        passportdto.setHintAns("answer");
        passportdto.setCaptcha("AB7123");

        PassportSeva passportseva=new PassportSeva();
        passportseva.userRegisterd(passportdto);
333









    }
}
