package com.xworkz.lenovoapp.lenovouserdata;

public class LenovoUserDto {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String country;
    private boolean subscribeToNewsletter;

    // Getters and Setters
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
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }
    public void setSubscribeToNewsletter(boolean subscribeToNewsletter) {
        this.subscribeToNewsletter = subscribeToNewsletter;
    }
    public boolean isSubscribeToNewsletter() {
        return subscribeToNewsletter;
    }
}