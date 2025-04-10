package com.xworkz.noukriapp.noukriuserdata;

import com.xworkz.noukriapp.statics.WorkStatus;

public class NoukriUserDto {
    private String fullName ;
    private String email;
    private String password ;
    private long mobileNumber ;
    private WorkStatus workStatus ;

    public void setFullName(String fullName){
        this.fullName= fullName;
    }

    public String getFullName(){
        return fullName;
    }

    public void setEmail(String email){
        this.email= email;
    }

    public String getEmail(){
        return email;
    }

    public void setMobileNumber(long mobileNumber){
        this.mobileNumber= mobileNumber;
    }

    public long getMobileNumber(){
        return mobileNumber;
    }

    public void setWorkStatus(WorkStatus workStatus){
        this.workStatus= workStatus;
    }

    public WorkStatus getWorkStatus() {
        return workStatus;
    }

    public void setPassword(String password){
        this.password= password;
    }

    public String getPassword(){
        return password;
    }
}
