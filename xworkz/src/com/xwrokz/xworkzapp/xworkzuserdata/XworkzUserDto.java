package com.xwrokz.xworkzapp.xworkzuserdata;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class XworkzUserDto {
    private String name;
    private String mail ;
    private long mobileNumber ;
    private int result;

//    public void setName(String name){
//        this.name = name ;
//    }
//
//    public String getName(){
//        return name ;
//    }
//
//    public void setMail(String mail){
//        this.mail = mail ;
//    }
//
//    public String getMail(){
//        return mail;
//    }
//
//    public void setMobileNumber(long mobileNumber){
//        this.mobileNumber = mobileNumber ;
//
//    }
//
//    public long getMobileNumber(){
//        return mobileNumber;
//    }
//
//    public void setResult(int result){
//        this.result = result ;
//
//    }
//
//    public int getResult(){
//        return result;
//    }
@Override
public String toString() {
    return "UserDto(Name: " + getName() + "\n" +
            "Email: " + getMail() + "\n" +
            "Mobile Number: " + getMobileNumber() + "\n" +
            "Result: " + getResult() + ")";
}

}
