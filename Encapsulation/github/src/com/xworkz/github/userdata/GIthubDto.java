package com.xworkz.github.userdata;

import com.xworkz.github.statics.Country;

public class GIthubDto {
    private String email ;
    private String password ;
    private String username ;
    private Country country ;

    public void setEmail(String email){
        this.email= email;
    }

    public String getEmail(){
        return email;
    }

    public void setPassword(String password){
        this.password= password;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String username){
        this.username= username;
    }

    public String getUsername(){
        return username;
    }

    public void setCountry(Country country){
        this.country= country;
    }

    public Country getCountry(){
        return country;
    }
}
