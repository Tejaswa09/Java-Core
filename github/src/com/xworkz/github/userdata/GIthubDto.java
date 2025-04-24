package com.xworkz.github.userdata;

import com.xworkz.github.statics.Country;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter


public class GIthubDto {
    private String email;
    private String password;
    private String username;
    private Country country;

    //    public void setEmail(String email){
//        this.email= email;
//    }
//
//    public String getEmail(){
//        return email;
//    }
//
//    public void setPassword(String password){
//        this.password= password;
//    }
//
//    public String getPassword(){
//        return password;
//    }
//
//    public void setUsername(String username){
//        this.username= username;
//    }
//
//    public String getUsername(){
//        return username;
//    }
//
//    public void setCountry(Country country){
//        this.country= country;
//    }
//
//    public Country getCountry(){
//        return country;
//    }
    @Override
    public String toString() {
        return "LoginDto(Username: " + getUsername() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Password: " + getPassword() + "\n" +
                "Country: " + getCountry() + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, username, country);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GIthubDto) {
            GIthubDto dto = (GIthubDto) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}
