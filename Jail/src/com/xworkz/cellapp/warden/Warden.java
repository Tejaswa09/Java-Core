package com.xworkz.cellapp.warden;

import com.xworkz.cellapp.guard.Guard;

public class Warden {
    public int wardenId;
    public String wardenName;
    public Guard[] guards ;

    public void getDetails(){
        System.out.println("Warden Id : "+wardenId);
        System.out.println("Warden Name : "+wardenName);
        for(Guard g : guards){
            g.showDetails();
        }
    }
}
