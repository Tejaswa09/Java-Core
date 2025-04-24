package com.xworkz.handmapp.userdata;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class HandMUserDto {
    private String email;
    private String password;
    private String dob;
    private boolean isAcceptedTerm;

    //    public void setEmail(String email){
//        this.email = email ;
//
//    }
//
//    public String getEmail(){
//        return email;
//    }
//
//    public void setPassword(String password){
//        this.password = password ;
//    }
//
//    public String getPasswordl(){
//        return password;
//    }
//
//    public void setDob(String dob){
//        this.dob = dob ;
//
//    }
//
//    public String getDob(){
//        return dob;
//    }
//
//    public void setAcceptedTerm(boolean isAcceptedTerm){
//        this.isAcceptedTerm = isAcceptedTerm ;
//    }
//
//    public boolean getAcceptedTerm(){
//        return isAcceptedTerm;
//    }
    @Override
    public String toString() {
        return "UserDto(Email: " + getEmail() + "\n" +
                "Password: " + getPassword() + "\n" +
                "Date of Birth: " + getDob() + "\n" +
                "Accepted Terms: " + isAcceptedTerm() + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, dob, isAcceptedTerm);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HandMUserDto) {
            HandMUserDto dto = (HandMUserDto) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}
