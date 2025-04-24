package com.xworkz.appleapp.appleuserdata;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter


public class AppleUserDto {
    private String firstName;
    private String lastName;
    private String appleId;
    private String password;
    private String confirmPassword;
    private String birthDate;

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
//    public void setAppleId(String appleId) {
//        this.appleId = appleId;
//    }
//    public String getAppleId() {
//        return appleId;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public String getPassword() {
//        return password;
//    }
//    public void setConfirmPassword(String confirmPassword) {
//        this.confirmPassword = confirmPassword;
//    }
//    public String getConfirmPassword() {
//        return confirmPassword;
//    }
//    public void setBirthDate(String birthDate) {
//        this.birthDate = birthDate;
//    }
//    public String getBirthDate() {
//        return birthDate;
//    }
    @Override
    public String toString() {
        return "AppleUserDto(First Name: " + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n" +
                "Apple ID: " + getAppleId() + "\n" +
                "Password: " + getPassword() + "\n" +
                "Confirm Password: " + getConfirmPassword() + "\n" +
                "Birth Date: " + getBirthDate() + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, appleId, password, confirmPassword, birthDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AppleUserDto) {
            AppleUserDto dto = (AppleUserDto) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}