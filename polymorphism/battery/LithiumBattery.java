package com.xworkz.polymorphism.battery;

public class LithiumBattery extends Battery{
    public void charge(){
        System.out.println("Charging method in Lithium");
    }
    public void discharge(){
        System.out.println("Discharge in lithium Battery");
    }
    public void type(){
        System.out.println("Lithium");
    }
    public void status(){
        System.out.println("Charging status in Lithium");
    }
    public void company(){
        System.out.println("Lithium by Tata battery");
    }
}
