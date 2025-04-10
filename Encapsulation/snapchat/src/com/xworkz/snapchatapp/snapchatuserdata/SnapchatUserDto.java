package com.xworkz.snapchatapp.snapchatuserdata;

import java.time.DayOfWeek;

public class SnapchatUserDto {
    private String firstName;
    private String lastName;
    private int year;
    private int day ;
    private int month ;
    private String userName ;
    private String password;

    public void setFirstName(String firstName){
        this.firstName= firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName= lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setYear(int year){
        this.year= year;
    }

    public int getYear(){
        return year;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getDay(){
        return day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getMonth(){
        return month;
    }

    public void setUserName(String userName){
        this.userName= userName;
    }

    public String getUserName(){
        return userName;
    }

    public void setPassword(String password){
        this.password= password;
    }

    public String getPassword(){
        return password;
    }
}
