package com.xworkz.polymorphism.router;

public class WirelessRouter extends Router {
    @Override
    public void type() {
        System.out.println("Type: Wireless Router");
    }

    @Override
    public void connectivity() {
        System.out.println("Connectivity: Wireless (Wi-Fi)");
    }

    @Override
    public void speed() {
        System.out.println("Speed: Up to 1 Gbps or more, depending on the router model");
    }

    @Override
    public void range() {
        System.out.println("Range: Typically 100-300 feet indoors");
    }

    @Override
    public void security() {
        System.out.println("Security: WPA3, WPA2, WPA, and guest network options");
    }
}
