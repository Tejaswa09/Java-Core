package com.xworkz.snapchatapp.snapchatuserregistration;

import com.xworkz.snapchatapp.snapchatuserdata.SnapchatUserDto;

public class SnapchatUserRegistration {

    public SnapchatUserDto dto ;

    public void userRegistration(SnapchatUserDto userDto){
        boolean isUserValidated = userValidate(userDto);
        if(isUserValidated){
            System.out.println("Registratin Sucessfull");
            dto = userDto ;
        }
    }

    public boolean userValidate(SnapchatUserDto userDto){
        boolean isUserValidated = false ;

        boolean isFirstnameValid = false ;
        boolean isLastnameValid = false ;
        boolean isMonthValid = false ;
        boolean isDayValid = false ;
        boolean isYearValid = false ;
        boolean isUsernameValid = false ;
        boolean isPasswordValid = false ;

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

        if(isFirstnameValid && isLastnameValid && isMonthValid && isDayValid && isYearValid && isUsernameValid && isPasswordValid){
            isUserValidated = true ;
        }else
            System.out.println("Registration unsucessfull...");

        return isUserValidated;
    }

    public void getUserDetails(){
        System.out.println("First Name :"+dto.getFirstName());
        System.out.println("Last Name :"+dto.getLastName());
        System.out.println("Date of Birth : "+dto.getDay()+"/"+dto.getMonth()+"/"+dto.getYear());
        System.out.println("UserName : "+dto.getUserName());
        System.out.println("Password :"+dto.getPassword());
    }
}
