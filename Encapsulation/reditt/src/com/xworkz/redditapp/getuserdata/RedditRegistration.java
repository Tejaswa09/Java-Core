package com.xworkz.redditapp.getuserdata;

import com.xworkz.redditapp.reddituserdata.RedditUserDto;

public class RedditRegistration {
    public RedditUserDto dto;
    public void userRegistered(RedditUserDto reddit) {
        if (userValidated(reddit)) {
            System.out.println("Reddit account created successfully!");
            System.out.println("Welcome, u/" + reddit.getUsername() + "!");
            dto= reddit;
        } else {
            System.out.println("Account creation failed. Please check your info.");
        }
    }

    public boolean userValidated(RedditUserDto reddit) {
        if (reddit.getEmail() == null || !reddit.getEmail().contains("@")) {
            System.out.println("Valid email required");
            return false;
        }

        if (reddit.getUsername() == null || reddit.getUsername().length() < 3) {
            System.out.println("Username must be 3+ characters");
            return false;
        }

        if (reddit.getPassword() == null || reddit.getPassword().length() < 8) {
            System.out.println("Password must be 8+ characters");
            return false;
        }

        return true;
    }

    public void getDetails(){
        System.out.println("Email :"+dto.getEmail());
        System.out.println("Password :"+dto.getPassword());
        System.out.println("username :"+dto.getUsername());
    }
}