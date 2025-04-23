package com.xworkz.github.gitregistration;

import com.xworkz.github.userdata.GIthubDto;

public class GItUserRegistration {

    public GIthubDto dto;

    public void userRegistration(GIthubDto githubDto){
        boolean isUserRegisted = validate(githubDto);
        if(isUserRegisted){
            System.out.println("Registration Sucessfull");
            dto = githubDto ;
        }
    }

    public boolean validate(GIthubDto githubDto){
        boolean isUserValid = false;

        boolean isEmailValid = false;
        boolean isPassworvalid = false ;
        boolean isUsenameValid = false ;
        boolean isCountryValid = false ;

        if(githubDto.getEmail() != null && !githubDto.getEmail().isEmpty() ){
            isEmailValid = true ;
        }else {
            System.out.println("Invalid email");
        }

        if(githubDto.getPassword() != null && !githubDto.getPassword().isEmpty() ){
            isPassworvalid = true ;
        }else {
            System.out.println("Invalid password");
        }

        if(githubDto.getUsername() != null && !githubDto.getUsername().isEmpty() ){
            isUsenameValid = true ;
        }else {
            System.out.println("Invalid Usename");
        }

        if(githubDto.getCountry() != null ){
            isCountryValid = true ;
        }
        if(isEmailValid && isPassworvalid && isUsenameValid && isCountryValid){
            isUserValid =true;
        }else System.out.println("Unsucessfull Registration");

        return isUserValid ;
    }

    public void getUserDetails(){
        System.out.println("Email : "+dto.getEmail());
        System.out.println("Password : "+dto.getPassword());
        System.out.println("Username : "+dto.getUsername());
        System.out.println("Country : "+dto.getCountry());
    }
}
