package com.xworkz.flipkartapp.flipkartuserdata;

public class FlipkartUserDto {
    private String enterMobileNumber;
    private String fullName;
    private String emailId;
    private String password;
    private String confirmPassword;

    public void setEnterMobileNumber(String enterMobileNumber) {
        this.enterMobileNumber = enterMobileNumber;
    }

    public String getEnterMobileNumber() {
        return enterMobileNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}