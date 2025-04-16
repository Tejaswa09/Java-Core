package com.xworkz.maxapp.getuserdata;

import com.xworkz.maxapp.maxuserdata.MaxUserDto;


public class MaxFashionRegistration {
    public void userRegistered(MaxUserDto max){
        Boolean isValidated = userValidated(max);
        if(isValidated)
            System.out.println("User Registration Sucessfull...");
        else System.out.println("Registration not sucessfull...please try again later");
    }

    public boolean userValidated(MaxUserDto max){
        boolean isUserValid=false;

        boolean isFullNameValid=false;
        boolean isBirthDateValid=false;
        boolean isEmailValid=false;
        boolean isPasswordValid=false;
        boolean isPincodeValid=false;
        boolean isGenderValid = false ;
        boolean isOtpValid = false ;



        if(max.getFullName()!=null&& !max.getFullName().isEmpty())
            isFullNameValid=true;
        else
            System.out.println("please enter a valid full name");

        if(max.getDob()!=null&&!max.getDob().isEmpty())
            isBirthDateValid=true;
        else
            System.out.println("please enter a valid birthdate");
        if(max.getEmail()!=null){
            isEmailValid=true;
        }
        else
            System.out.println("please enter a valid email id");

        if(max.getPassword()!=null)
            isPasswordValid=true;
        else
            System.out.println("please enter a valid password");

        if(max.getPincode()!=0 )
            isPincodeValid=true;
        else
            System.out.println("please enter a valid pincode");

        if(max.getGender()!=null )
            isGenderValid=true;
        else
        {
            System.out.println("please enter a valid Gender");
        }


        if(max.getOtp()!=0 )
            isGenderValid=true;



        if(isFullNameValid && isBirthDateValid && isBirthDateValid && isEmailValid && isPasswordValid && isPincodeValid && isGenderValid && isGenderValid)
            isUserValid=true;
        return isUserValid;

    }
}
