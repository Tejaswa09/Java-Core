package com.xworkz.github;

import com.xworkz.github.gitregistration.GItUserRegistration;
import com.xworkz.github.statics.Country;
import com.xworkz.github.userdata.GIthubDto;

public class GithubRunner {
    public static void main(String[] args) {
        GIthubDto gitDto =new GIthubDto();
        gitDto.setEmail("tejaswad18@gmail.com");
        gitDto.setUsername("tejaswa09");
        gitDto.setPassword("GIt");
        gitDto.setCountry(Country.India);
        System.out.println(gitDto);

        GItUserRegistration git = new GItUserRegistration();

        git.userRegistration(gitDto);
//        git.getUserDetails();
    }
}
