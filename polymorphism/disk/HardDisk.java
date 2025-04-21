package com.xworkz.polymorphism.disk;

public class HardDisk extends Disk {
    @Override
    public void type() {
        System.out.println("Type: Hard Disk Drive (HDD)");
    }

    @Override
    public void capacity() {
        System.out.println("Capacity: Up to 10 TB");
    }

    @Override
    public void speed() {
        System.out.println("Speed: 5400 to 7200 RPM");
    }

    @Override
    public void usage() {
        System.out.println("Usage: Long-term data storage in computers and servers");
    }

    @Override
    public void interfaceType() {
        System.out.println("Interface: SATA or USB 3.0");
    }
}
