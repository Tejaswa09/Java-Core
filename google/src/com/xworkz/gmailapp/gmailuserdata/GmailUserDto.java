package com.xworkz.gmailapp.gmailuserdata;

import com.xworkz.gmailapp.statics.Gender;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class GmailUserDto {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String confirmPassword;
    private String recoveryEmail;
    private String phoneNumber;
    private String birthDay;
    private String birthMonth;
    private String birthYear;
    private Gender gender;

    // Getters and Setters
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
//    public void setUsername(String username) {
//        this.username = username;
//    }
//    public String getUsername() {
//        return username;
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
//    public void setRecoveryEmail(String recoveryEmail) {
//        this.recoveryEmail = recoveryEmail;
//    }
//    public String getRecoveryEmail() {
//        return recoveryEmail;
//    }
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//    public void setBirthDay(String birthDay) {
//        this.birthDay = birthDay;
//    }
//    public String getBirthDay() {
//        return birthDay;
//    }
//    public void setBirthMonth(String birthMonth) {
//        this.birthMonth = birthMonth;
//    }
//    public String getBirthMonth() {
//        return birthMonth;
//    }
//    public void setBirthYear(String birthYear) {
//        this.birthYear = birthYear;
//    }
//    public String getBirthYear() {
//        return birthYear;
//    }
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }
//    public Gender getGender() {
//        return gender;
//    }
    @Override
    public String toString() {
        return "AccountDto(First Name: " + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n" +
                "Username: " + getUsername() + "\n" +
                "Password: " + getPassword() + "\n" +
                "Confirm Password: " + getConfirmPassword() + "\n" +
                "Recovery Email: " + getRecoveryEmail() + "\n" +
                "Phone Number: " + getPhoneNumber() + "\n" +
                "Birth Day: " + getBirthDay() + "\n" +
                "Birth Month: " + getBirthMonth() + "\n" +
                "Birth Year: " + getBirthYear() + "\n" +
                "Gender: " + getGender() + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, username, password, confirmPassword, recoveryEmail, phoneNumber, birthDay, birthMonth, birthYear, gender);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GmailUserDto) {
            GmailUserDto dto = (GmailUserDto) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}