package com.xworkz.xapp.xuserdata;

public class XUserDto {
    private String name ;
    private String email ;
    private int day;
    private int month ;
    private int year ;

    public void setName(String name){
        this.name = name;

    }

    public String getName(){
        return name ;
    }

    public void setEmail(String email){
        this.email =email;

    }

    public String getEmail(){
        return email ;
    }

    public void setDay(int day){
        this.day = day;

    }

    public int getDay(){
        return day ;
    }

    public void setMonth(int month){
        this.month =month;

    }
    public int getMonth(){
        return month ;
    }

    public void setYear(int year){
        this.year = year;

    }
    public int getYear(){
        return year ;
    }
}
