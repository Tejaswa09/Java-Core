package com.xworkz.polymorphism.disk;

public class DiskRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        HardDisk hardDisk = new HardDisk();
        hardDisk.type();
        hardDisk.capacity();
        hardDisk.speed();
        hardDisk.usage();
        hardDisk.interfaceType();
        System.out.println();

        System.out.println("Parent Details:");
        Disk disk = new Disk();
        disk.type();
        disk.capacity();
        disk.speed();
        disk.usage();
        disk.interfaceType();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Disk hardDiskAsDisk = new HardDisk();
        hardDiskAsDisk.type();
        hardDiskAsDisk.capacity();
        hardDiskAsDisk.speed();
        hardDiskAsDisk.usage();
        hardDiskAsDisk.interfaceType();
    }
}
