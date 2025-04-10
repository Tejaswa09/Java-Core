package com.xworkz.blinkitapp.blinkituserdata;

public class BlinkitUserDto {
    private String phoneNumber;
    private String name;
    private String password;
    private boolean termsAccepted;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setTermsAccepted(boolean termsAccepted) {
        this.termsAccepted = termsAccepted;
    }

    public boolean isTermsAccepted() {
        return termsAccepted;
    }
}