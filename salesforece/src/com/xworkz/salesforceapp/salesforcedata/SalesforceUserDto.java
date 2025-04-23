package com.xworkz.salesforceapp.salesforcedata;

import com.xworkz.salesforceapp.statics.Country;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SalesforceUserDto {
    private String firstName ;
    private String lastName ;
    private String jobTitle ;
    private String email ;
    private int noOfEmployees ;
    private long mobileNumber ;
    private Country country ;

//    public void setFirstName(String firstName){
//        this.firstName= firstName ;
//    }
//
//    public String getFirstName(){
//        return firstName ;
//    }
//
//    public void setLastName(String lastName){
//        this.lastName= lastName ;
//    }
//
//    public String getLastName(){
//        return lastName ;
//    }
//
//    public void setJobTitle(String jobTitle){
//        this.jobTitle= jobTitle ;
//    }
//
//    public String getJobTitle(){
//        return jobTitle;
//    }
//
//    public void setEmail(String email){
//        this.email= email ;
//    }
//
//    public String getEmail(){
//        return email;
//    }
//
//    public void setNoOfEmployees(int noOfEmployees){
//        this.noOfEmployees= noOfEmployees ;
//    }
//
//    public int getNoOfEmployees(){
//        return noOfEmployees;
//    }
//
//    public void setMobileNumber(long mobileNumber){
//        this.mobileNumber= mobileNumber ;
//    }
//
//    public long getMobileNumber(){
//        return mobileNumber;
//    }
//
//    public void setCountry(Country country){
//        this.country= country ;
//    }
//
//    public Country getCountry(){
//        return country;
//    }

    @Override
    public String toString() {
        return "CompanyDto(First Name: " + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n" +
                "Job Title: " + getJobTitle() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Number of Employees: " + getNoOfEmployees() + "\n" +
                "Mobile Number: " + getMobileNumber() + "\n" +
                "Country: " + getCountry() + ")";
    }

}
