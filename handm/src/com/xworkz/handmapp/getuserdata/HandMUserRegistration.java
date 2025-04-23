package com.xworkz.handmapp.getuserdata;

import com.xworkz.handmapp.userdata.HandMUserDto;

public class HandMUserRegistration {
    public void registration(HandMUserDto handm){
        boolean isUserRegistered = vallidateUser(handm) ;
        if(isUserRegistered){
            System.out.println("Registration Sucessfull");
        }
    }

    public boolean vallidateUser(HandMUserDto handm){
        boolean isUserValidated = false ;

        boolean isEmailValid = false ;
        boolean isDobValid = false ;
        boolean isPasswordValid = false ;

        if(handm.getEmail()!=null){
            isEmailValid = true ;
        }else{
            System.out.println("Invalid Email");
        }

        if(handm.getDob()!= null){
            isDobValid = true ;
        }else{
            System.out.println("Invalid DOB");
        }

        if(handm.getPassword()!= null){
            isPasswordValid=true;
        }else{
            System.out.println("Invalid Password");
        }

        if(isEmailValid && isPasswordValid && isDobValid && handm.isAcceptedTerm()){
            isUserValidated = true ;
        }else{
            System.out.println("Registration Unsucessfull...");
        }

        return isUserValidated;
    }

}
