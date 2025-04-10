package com.xworkz.zeptoapp.zeptouserdata;

public class ZeptoUserDto {
    private String phoneNumber;
    private String name;
    private String email;
    private String password;
    private String referralCode;
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

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setTermsAccepted(boolean termsAccepted) {
        this.termsAccepted = termsAccepted;
    }

    public boolean isTermsAccepted() {
        return termsAccepted;
    }
}