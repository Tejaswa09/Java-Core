package com.xworkz.polymorphism.opertingsystem;

public class OperatingSystemRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Windows windows = new Windows();
        windows.name();
        windows.version();
        windows.architecture();
        windows.developer();
        windows.cost();
        System.out.println();

        System.out.println("Parent Details:");
        OperatingSystem os = new OperatingSystem();
        os.name();
        os.version();
        os.architecture();
        os.developer();
        os.cost();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        OperatingSystem windowsAsOS = new Windows();
        windowsAsOS.name();
        windowsAsOS.version();
        windowsAsOS.architecture();
        windowsAsOS.developer();
        windowsAsOS.cost();
    }
}

