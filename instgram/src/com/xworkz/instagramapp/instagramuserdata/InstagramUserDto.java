package com.xworkz.instagramapp.instagramuserdata;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class InstagramUserDto {
    private String emailOrPhone;
    private String fullName;
    private String username;
    private String password;

//    public void setEmailOrPhone(String emailOrPhone) {
//        this.emailOrPhone = emailOrPhone;
//    }
//    public String getEmailOrPhone() {
//        return emailOrPhone;
//    }
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//    public String getFullName() {
//        return fullName;
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
@Override
public String toString() {
    return "UserDto(Full Name: " + getFullName() + "\n" +
            "Username: " + getUsername() + "\n" +
            "Email or Phone: " + getEmailOrPhone() + "\n" +
            "Password: " + getPassword() + ")";
}

}