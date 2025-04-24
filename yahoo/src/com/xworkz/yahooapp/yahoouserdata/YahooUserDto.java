package com.xworkz.yahooapp.yahoouserdata;

import com.xworkz.yahooapp.statics.Gender;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter@Setter

public class YahooUserDto {
    private String firstName;
    private String lastName;
    private String yahooId;
    private String password;
    private String mobileNumber;
    private String birthMonth;
    private String birthDay;
    private String birthYear;
    private Gender gender;

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
//    public void setYahooId(String yahooId) {
//        this.yahooId = yahooId;
//    }
//    public String getYahooId() {
//        return yahooId;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public String getPassword() {
//        return password;
//    }
//    public void setMobileNumber(String mobileNumber) {
//        this.mobileNumber = mobileNumber;
//    }
//    public String getMobileNumber() {
//        return mobileNumber;
//    }
//    public void setBirthMonth(String birthMonth) {
//        this.birthMonth = birthMonth;
//    }
//    public String getBirthMonth() {
//        return birthMonth;
//    }
//    public void setBirthDay(String birthDay) {
//        this.birthDay = birthDay;
//    }
//    public String getBirthDay() {
//        return birthDay;
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
    return "UserDto(First Name: " + getFirstName() + "\n" +
            "Last Name: " + getLastName() + "\n" +
            "Yahoo ID: " + getYahooId() + "\n" +
            "Password: " + getPassword() + "\n" +
            "Mobile Number: " + getMobileNumber() + "\n" +
            "Birth Month: " + getBirthMonth() + "\n" +
            "Birth Day: " + getBirthDay() + "\n" +
            "Birth Year: " + getBirthYear() + "\n" +
            "Gender: " + getGender() + ")";
}

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, yahooId, password, mobileNumber, birthMonth, birthDay, birthYear, gender);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof YahooUserDto) {
            YahooUserDto dto = (YahooUserDto) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}