package com.xworkz.amazonapp.amazonuserdata;

import com.xworkz.amazonapp.statics.Gender;

public class AmazonUserDto {
    private String name;
    private long mobileNumber;
    private String password;
    private String email;
    private String birthDay;
    private Gender gender;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }
}