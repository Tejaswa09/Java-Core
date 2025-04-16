package com.xworkz.redditapp.reddituserdata;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RedditUserDto {
    private String email;
    private String username;
    private String password;
    private boolean newsletterSubscription;

//    // Getters and Setters
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public String getEmail() {
//        return email;
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
//    public void setNewsletterSubscription(boolean newsletterSubscription) {
//        this.newsletterSubscription = newsletterSubscription;
//    }
//    public boolean isNewsletterSubscription() {
//        return newsletterSubscription;
//    }
}