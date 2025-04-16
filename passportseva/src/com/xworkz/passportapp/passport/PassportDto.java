package com.xworkz.passportapp.passport;

import com.xworkz.passportapp.constants.CpvLocation;
import com.xworkz.passportapp.constants.DcdrLocation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PassportDto {
    private CpvLocation cpvLocation ;
    private DcdrLocation dcdrLocation;
    private String givenName;
    private String surName;
    private String dob;
    private String email;
    private boolean emailLoginSame;
    private String loginId;
    private String pwd;
    private String confirmPwd;
    private String hintQues;
    private String hintAns;
    private String captcha;


}
