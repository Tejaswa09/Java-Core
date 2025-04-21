package com.xworkz.polymorphism.packageManager;

public class AptManager extends PackageManager {
    @Override
    public void install() {
        System.out.println("Install: Installing package using apt (Advanced Package Tool)");
    }

    @Override
    public void uninstall() {
        System.out.println("Uninstall: Removing package using apt");
    }

    @Override
    public void update() {
        System.out.println("Update: Updating package list and installed packages using apt");
    }

    @Override
    public void search() {
        System.out.println("Search: Searching for a package using apt");
    }

    @Override
    public void listPackages() {
        System.out.println("List: List of installed packages using apt");
    }
}
