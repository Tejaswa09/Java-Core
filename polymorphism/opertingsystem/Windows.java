package com.xworkz.polymorphism.opertingsystem;


public class Windows extends OperatingSystem {
    @Override
    public void name() {
        System.out.println("Operating System: Windows");
    }

    @Override
    public void version() {
        System.out.println("Version: Windows 11");
    }

    @Override
    public void architecture() {
        System.out.println("Architecture: 64-bit");
    }

    @Override
    public void developer() {
        System.out.println("Developer: Microsoft");
    }

    @Override
    public void cost() {
        System.out.println("Cost: Paid version, but comes free with some PCs");
    }
}
