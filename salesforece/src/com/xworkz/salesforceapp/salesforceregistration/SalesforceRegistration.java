package com.xworkz.salesforceapp.salesforceregistration;

import com.xworkz.salesforceapp.salesforcedata.SalesforceUserDto;

public class SalesforceRegistration {
    public SalesforceUserDto dto;

    public void registration(SalesforceUserDto dto) {
        boolean isUserRegistered = validate(dto);
        if (isUserRegistered) {
            System.out.println("User Registerd sucessfull");
            this.dto = dto;
        }
    }

    public boolean validate(SalesforceUserDto dto) {
        boolean isUserValidated = false;

        boolean isFirstnameValid = false;
        boolean isLastnameValid = false;
        boolean isJobTitleValid = false;
        boolean isEmailValid = false;
        boolean isNoOfEmployessValid = false;
        boolean isMobileNumberValid = false;
        boolean isCountryValid = false;


        if (dto.getFirstName() != null && !dto.getFirstName().isEmpty()) {
            isFirstnameValid = true;
        } else {
            System.out.println("Invalid FirstName");
        }

        if (dto.getLastName() != null && !dto.getLastName().isEmpty()) {
            isLastnameValid = true;
        } else {
            System.out.println("Invalid LastName");
        }

        if(dto.getJobTitle() != null && !dto.getJobTitle().isEmpty()){
            isJobTitleValid = true ;
        }else {
            System.out.println("Invalid Job Title");
        }

        if(dto.getEmail() != null && !dto.getEmail().isEmpty()){
            isEmailValid = true ;
        }else {
            System.out.println("Invalid Email");
        }

        if(dto.getNoOfEmployees() != 0 ){
            isNoOfEmployessValid = true ;
        }else {
            System.out.println("Invalid FirstName");
        }

        if(dto.getMobileNumber() != 0){
            isMobileNumberValid = true ;
        }else {
            System.out.println("Invalid Mobile");
        }

        if(dto.getCountry() != null){
            isCountryValid = true ;
        }else {
            System.out.println("Invalid Country");
        }

        if(isFirstnameValid && isLastnameValid && isJobTitleValid && isEmailValid && isNoOfEmployessValid && isMobileNumberValid && isCountryValid){
            isUserValidated = true ;
        }else System.out.println("Registration Unsucessfull");

        return isUserValidated;
    }

    public void getUserDetails(){
        System.out.println("First Name :" +dto.getFirstName());
        System.out.println("Last Nem : "+dto.getLastName());
        System.out.println("Job Title :"+dto.getJobTitle());
        System.out.println("Email : "+dto.getJobTitle());
        System.out.println("No of Employees : "+dto.getNoOfEmployees());
        System.out.println("MObile Number :"+dto.getMobileNumber());
        System.out.println("COuntry :"+dto.getCountry());
    }
}
