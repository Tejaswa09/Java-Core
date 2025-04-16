package com.xworkz.myntraapp.myntrauserdata;

import com.xworkz.myntraapp.statics.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MyntraDto {
    private String name;
    private String mobileNumber;
    private String email;
    private String password;
    private String dateOfBirth;
    private Gender gender;
    private boolean receiveUpdates;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setMobileNumber(String mobileNumber) {
//        this.mobileNumber = mobileNumber;
//    }
//
//    public String getMobileNumber() {
//        return mobileNumber;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setDateOfBirth(String dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public String getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }
//
//    public Gender getGender() {
//        return gender;
//    }
//
//    public void setReceiveUpdates(boolean receiveUpdates) {
//        this.receiveUpdates = receiveUpdates;
//    }
//
//    public boolean isReceiveUpdates() {
//        return receiveUpdates;
//    }
}