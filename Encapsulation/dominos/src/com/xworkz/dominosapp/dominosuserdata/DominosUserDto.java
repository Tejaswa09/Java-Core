package com.xworkz.dominosapp.dominosuserdata;

public class DominosUserDto {
    private String mobileNumber;
    private String name;
    private String email;
    private String password;
    private String deliveryAddress;

    // Getters and Setters
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getMobileNumber() {
        return mobileNumber;
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
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}