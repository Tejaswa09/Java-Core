package com.xworkz.passportapp.getpassport;


import com.xworkz.passportapp.passport.PassportDto;

public class PassportSeva {

    public void userRegisterd(PassportDto passportDto){
        boolean isUserValid=userValid(passportDto);
        if(isUserValid){
            System.out.println("user registration successfull");

        }
        else
            System.out.println("user not registerd");
    }
    public boolean userValid( PassportDto passportDto){
        boolean isUserValid=false;
        boolean isAreaValid=false;
        boolean isLocationvalid=false;
        boolean isFirstNameValid=false;
        boolean isLastNameValid=false;
        boolean isBirthDateValid=false;
        boolean isEmailValid=false;
        boolean isUserIdValid=false;
        boolean isPasswordValid=false;
        boolean isConfirmPasswordValid=false;
        boolean issecurityQuetionValid=false;
        boolean isSecurityAnswervalid=false;
        boolean isCaptchaValid=false;
        if(passportDto.getCpvLoctaion()!=null)
            isAreaValid=true;
        else
            System.out.println("the area is invalid");
        if( passportDto.getCpvLoctaion()!=null)
            isLocationvalid=true;
        else
            System.out.println("location enters is invalid");
        if(passportDto.getGivenName()!=null&& !passportDto.getGivenName().isEmpty())
            isFirstNameValid=true;
        else
            System.out.println("please enter a valid first name");
        if(passportDto.getSurName()!=null&& !passportDto.getSurName().isEmpty())
            isLastNameValid=true;
        else
            System.out.println("please enter a valid last name");
        if(passportDto.getDob()!=null&&!passportDto.getDob().isEmpty())
            isBirthDateValid=true;
        else
            System.out.println("please enter a valid birthdate");
        if(passportDto.getEmail()!=null){
            isEmailValid=true;
        }
        else
            System.out.println("please enter a valid email id");
        if(passportDto.getEmail()==passportDto.getSetLoginId() && passportDto.getSetLoginId()!=null)
            isUserIdValid=true;
        else
            System.out.println("invalid user id");
        if(passportDto.getPwd()!=null)
            isPasswordValid=true;
        else
            System.out.println("please enter a valid password");
        if(passportDto.getConfirmPwd()!=null&& passportDto.getPwd().equals(passportDto.getConfirmPwd()))
            isConfirmPasswordValid=true;
        else
            System.out.println("password and confirm password are not matching");
        if(passportDto.getHintAns()!=null)
            issecurityQuetionValid=true;
        else
            System.out.println("this field can not be null");
        if(passportDto.getHintAns()!=null)
            isSecurityAnswervalid=true;
        else
            System.out.println("this field can not be null");
        if(passportDto.getCaptcha()!=null)
            isCaptchaValid=true;
        else
            System.out.println("this field can not be null");

        if(isAreaValid&& isLocationvalid&& isFirstNameValid&& isLastNameValid &&isBirthDateValid&&isEmailValid&&isUserIdValid&&isPasswordValid&& isConfirmPasswordValid&&issecurityQuetionValid && isSecurityAnswervalid&& isCaptchaValid)
            isUserValid=true;
        return isUserValid;
    }

}
