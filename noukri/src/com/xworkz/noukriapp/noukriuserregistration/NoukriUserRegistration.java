package com.xworkz.noukriapp.noukriuserregistration;

import com.xworkz.noukriapp.noukriuserdata.NoukriUserDto;
import com.xworkz.noukriapp.statics.WorkStatus;

public class NoukriUserRegistration {

    public NoukriUserDto dto ;

    public void userRegistration(NoukriUserDto userDto){
        boolean isUserValidated = userValidate(userDto);
        if(isUserValidated){
            System.out.println("Registratin Sucessfull");
            dto = userDto ;
        }
    }

    public boolean userValidate(NoukriUserDto userDto){
        boolean isUserValidated = false ;

        boolean isFullNameValid = false ;
        boolean isEmailValid = false ;
        boolean isMobileNumberValid = false ;
        boolean isWorkExperienceValid = false ;
        boolean isPasswordValid = false ;

        if(userDto.getFullName() != null && !userDto.getFullName().isEmpty()){
            isFullNameValid = true ;
        }else {
            System.out.println("Invalid Full Name");
        }

        if(userDto.getEmail() != null && !userDto.getEmail().isEmpty()){
            isEmailValid = true ;
        }else {
            System.out.println("Invalid Email");
        }

        if(userDto.getMobileNumber() != 0){
            isMobileNumberValid = true ;
        }else {
            System.out.println("Invalid Mobile Number");
        }

        if(userDto.getPassword() != null && !userDto.getPassword().isEmpty()){
            isPasswordValid= true ;
        }else {
            System.out.println("Invalid Password");
        }

        if(userDto.getWorkStatus() != null){
            isWorkExperienceValid = true ;
        }

        if(isFullNameValid && isEmailValid && isMobileNumberValid && isPasswordValid && isWorkExperienceValid){
            isUserValidated = true;
        }else System.out.println("User Registration Unsucessfull");

        return isUserValidated;
    }

    public void getUserData(){
        System.out.println("Full Name : "+dto.getFullName());
        System.out.println("Email : "+dto.getEmail());
        System.out.println("Mobile : "+dto.getPassword());
        System.out.println("Work Status : "+dto.getWorkStatus());
    }

}
