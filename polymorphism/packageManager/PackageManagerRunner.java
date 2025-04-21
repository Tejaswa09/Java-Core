package com.xworkz.polymorphism.packageManager;

public class PackageManagerRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        AptManager aptManager = new AptManager();
        aptManager.install();
        aptManager.uninstall();
        aptManager.update();
        aptManager.search();
        aptManager.listPackages();
        System.out.println();

        System.out.println("Parent Details:");
        PackageManager packageManager = new PackageManager();
        packageManager.install();
        packageManager.uninstall();
        packageManager.update();
        packageManager.search();
        packageManager.listPackages();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        PackageManager aptManagerAsPackageManager = new AptManager();
        aptManagerAsPackageManager.install();
        aptManagerAsPackageManager.uninstall();
        aptManagerAsPackageManager.update();
        aptManagerAsPackageManager.search();
        aptManagerAsPackageManager.listPackages();
    }
}
