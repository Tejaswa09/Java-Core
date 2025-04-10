package com.xworkz.maxapp.maxuserdata;

import com.xworkz.maxapp.statics.Gender;

public class MaxUserDto {
    private String fullName ;
    private long mobileNumber ;
    private String email ;
    private String password ;
    private String dob ;
    private Gender gender ;
    private int pincode ;
    private int otp ;

    public void setFullName(String fullName){
        this.fullName = fullName ;
    }

    public String getFullName(){
        return fullName ;
    }

    public void setMobileNumber(long mobileNumber){
        this.mobileNumber = mobileNumber ;
    }

    public long getMobileNumber(){
        return mobileNumber ;
    }

    public void setEmail(String email){
        this.email = email ;
    }

    public String getEmail(){
        return email ;
    }

    public void setPassword(String password){
        this.password = password ;
    }

    public String getPassword(){
        return password ;
    }
    public void setDob(String dob){
        this.dob = dob ;
    }

    public String getDob(){
        return dob ;
    }

    public void setGender(Gender gender){
        this.gender = gender ;
    }

    public Gender getGender(){
        return gender ;
    }

    public void setPincode(int pincode){
        this.pincode = pincode;
    }

    public int getPincode(){
        return pincode ;
    }

    public void setOtp(int otp){
        this.otp = otp ;
    }

    public int getOtp(){
        return otp ;
    }
}
