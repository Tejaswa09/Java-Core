package com.xworkz.titanapp.titanuserdata;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter

public class TitanUserDto {
    private String name;
    private String mobileNumber;
    private String email;
    private String password;

    //    // Getters and Setters
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setMobileNumber(String mobileNumber) {
//        this.mobileNumber = mobileNumber;
//    }
//    public String getMobileNumber() {
//        return mobileNumber;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public String getPassword() {
//        return password;
//    }
    @Override
    public String toString() {
        return "UserDto(Name: " + getName() + "\n" +
                "Mobile Number: " + getMobileNumber() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Password: " + getPassword() + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobileNumber, email, password);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TitanUserDto) {
            TitanUserDto dto = (TitanUserDto) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        TitanUserDto dto = (TitanUserDto) obj;
        System.out.println(this.hashCode());
        System.out.println(obj.hashCode());
        return false;
    }

}