package com.xworkz.redditapp;

import com.xworkz.redditapp.getuserdata.RedditRegistration;
import com.xworkz.redditapp.reddituserdata.RedditUserDto;

public class RedditRunner {
    public static void main(String[] args) {
        RedditUserDto reddit = new RedditUserDto();
        reddit.setEmail("tejaswa@gmail.com");
        reddit.setUsername("tejaswa123");
        reddit.setPassword("tejaswa123");
        reddit.setNewsletterSubscription(true);

        RedditRegistration redditRegistration = new RedditRegistration();
        redditRegistration.userRegistered(reddit);
        redditRegistration.getDetails();
    }
}