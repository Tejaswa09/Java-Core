package com.xworkz.polymorphism.packageManager;

public class PackageManager {
    public void install() {
        System.out.println("Install: Generic package installation");
    }

    public void uninstall() {
        System.out.println("Uninstall: Generic package uninstallation");
    }

    public void update() {
        System.out.println("Update: Generic package update");
    }

    public void search() {
        System.out.println("Search: Searching for a package");
    }

    public void listPackages() {
        System.out.println("List: List of installed packages");
    }
}
