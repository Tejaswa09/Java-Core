package com.xworkz.polymorphism.network;

public class WifiNetwork extends Network {
    @Override
    public void type() {
        System.out.println("Type: WiFi Network");
    }

    @Override
    public void speed() {
        System.out.println("Speed: Up to 1 Gbps (depends on router and plan)");
    }

    @Override
    public void security() {
        System.out.println("Security: WPA2, WPA3, WPA");
    }

    @Override
    public void coverage() {
        System.out.println("Coverage: Limited to the range of the router");
    }

    @Override
    public void cost() {
        System.out.println("Cost: Varies based on internet service provider and plan");
    }
}
