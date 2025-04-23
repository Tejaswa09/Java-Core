package com.xworkz.facebookapp.facebookuserdata;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter

public class FacebookUserDto {
    private String firstName;
    private String lastName;
    private String emailOrMobile;
    private String password;
    private String birthDate;
    private String gender;

//    // Getters and Setters
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//    public String getFirstName() {
//        return firstName;
//    }
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//    public String getLastName() {
//        return lastName;
//    }
//    public void setEmailOrMobile(String emailOrMobile) {
//        this.emailOrMobile = emailOrMobile;
//    }
//    public String getEmailOrMobile() {
//        return emailOrMobile;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public String getPassword() {
//        return password;
//    }
//    public void setBirthDate(String birthDate) {
//        this.birthDate = birthDate;
//    }
//    public String getBirthDate() {
//        return birthDate;
//    }
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//    public String getGender() {
//        return gender;
//    }
@Override
public String toString() {
    return "SignupDto(First Name: " + getFirstName() + "\n" +
            "Last Name: " + getLastName() + "\n" +
            "Email or Mobile: " + getEmailOrMobile() + "\n" +
            "Password: " + getPassword() + "\n" +
            "Birth Date: " + getBirthDate() + "\n" +
            "Gender: " + getGender() + ")";
}

}