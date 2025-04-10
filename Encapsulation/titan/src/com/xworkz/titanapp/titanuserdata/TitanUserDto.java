package com.xworkz.titanapp.titanuserdata;

public class TitanUserDto {
    private String name;
    private String mobileNumber;
    private String email;
    private String password;

    // Getters and Setters
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}