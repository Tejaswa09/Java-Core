package com.xworkz.linkedinapp.userregistration;

import com.xworkz.linkedinapp.linkedinuserdata.LinkedinUserDto;

public class LinkedinUserRegistration {
    public LinkedinUserDto userDto ;
    public void registerUser(LinkedinUserDto userDto){
        boolean isUserValidated = userValidate(userDto);

        if(isUserValidated){
            System.out.println("Registration Sucessfull");
            this.userDto = userDto ;
        }
    }

    public boolean userValidate(LinkedinUserDto userDto){
        boolean isUserValidated = false ;

        boolean isFirstnameValid = false ;
        boolean isLastnameValid = false ;
        boolean isMonthValid = false ;
        boolean isDayValid = false ;
        boolean isYearValid = false ;
        boolean isUsernameValid = false ;
        boolean isPasswordValid = false ;
        boolean isGenderValid = false ;

        if(userDto.getFirstName() != null && !userDto.getFirstName().isEmpty()){
            isFirstnameValid = true ;
        }else {
            System.out.println("Invalid FirstName");
        }

        if(userDto.getLastName() != null && !userDto.getLastName().isEmpty()){
            isLastnameValid = true ;
        }else {
            System.out.println("Invalid Lastname");
        }

        if(userDto.getMonth() != 0 ){
            isMonthValid = true ;
        }else {
            System.out.println("Invalid Month");
        }

        if(userDto.getDay() != 0 ){
            isDayValid = true ;
        }else {
            System.out.println("Invalid Day");
        }

        if(userDto.getYear() != 0 ){
            isYearValid = true ;
        }else {
            System.out.println("Invalid Year");
        }

        if(userDto.getUserName() != null && !userDto.getUserName().isEmpty() ){
            isUsernameValid = true ;
        }else {
            System.out.println("Invalid Username");
        }

        if(userDto.getPassword() != null && !userDto.getPassword().isEmpty() ){
            isPasswordValid = true ;
        }else {
            System.out.println("Invalid Password");
        }

        if(userDto.getGender() != null){
            isGenderValid = true ;
        }else System.out.println("Invaid Gender");

        if(isFirstnameValid && isLastnameValid && isMonthValid && isDayValid && isYearValid && isUsernameValid && isPasswordValid){
            isUserValidated = true ;
        }else
            System.out.println("Registration unsucessfull...");

        return isUserValidated;
    }

    public void getUserDetails(){
        System.out.println("First Name :"+this.userDto.getFirstName());
        System.out.println("Last Name :"+this.userDto.getLastName());
        System.out.println("Date of Birth : "+this.userDto.getDay()+"/"+this.userDto.getMonth()+"/"+this.userDto.getYear());
        System.out.println("Gender ; "+this.userDto.getGender());
        System.out.println("UserName : "+this.userDto.getUserName());
        System.out.println("Password :"+this.userDto.getPassword());

    }
}
