package com.xworkz.xapp.userregistration;

import com.xworkz.xapp.xuserdata.XUserDto;

public class XUserRegistration {
    public XUserDto dto ;

    public void userRegistration(XUserDto userDto){
        boolean isUserValidated = userValidate(userDto);
        if(isUserValidated){
            System.out.println("Registratin Sucessfull");
            dto = userDto ;
        }
    }

    public boolean userValidate(XUserDto userDto){
        boolean isUserValidate = false;
        boolean isFullNameValid = false ;
        boolean isEmailValid = false ;
        boolean isDayValid = false;
         boolean isMonthValid = false;
         boolean isYearValid = false ;

        if(userDto.getName() != null && !userDto.getName().isEmpty() ){
            isFullNameValid = true ;
        }else {
            System.out.println("Invalid Name");
        }

        if(userDto.getEmail() != null && !userDto.getEmail().isEmpty() ){
            isEmailValid = true ;
        }else {
            System.out.println("Invalid Email");
        }

        if(userDto.getDay() != 0  ){
            isDayValid = true ;
        }else {
            System.out.println("Invalid DAY");
        }

        if(userDto.getMonth() != 0  ){
            isMonthValid = true ;
        }else {
            System.out.println("Invalid Month");
        }

        if(userDto.getYear() != 0  ){
            isYearValid = true ;
        }else {
            System.out.println("Invalid Year");
        }

        if(isFullNameValid && isEmailValid && isDayValid && isMonthValid && isYearValid){
            isUserValidate = true ;
        }else System.out.println("Registration Unsucessfull");

        return isUserValidate;
    }

    public void getUserDetails(){
        System.out.println("Name : "+dto.getName());
        System.out.println("email : "+dto.getEmail());
        System.out.println("Date Of Birth : "+dto.getDay()+"/"+dto.getMonth()+"/"+dto.getYear());
    }
}
